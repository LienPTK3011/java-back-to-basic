package baitapoop;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu1 {
    public static void showMenu1() {
        System.out.println("1. Thêm sinh viên mới");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Sắp xếp danh sach sinh viên giảm dần");
        System.out.println("4. Sắp xếp danh sach sinh viên tăng dần");
        System.out.println("5. Kiểm tra học bổng");
        System.out.println("0. Để thoát");
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        DateUtil dateUtil = new DateUtil();
        Student student1 = new Student("A", "Nam", "HN",
                dateUtil.convertStringToDate("16/1/2020"), "001", 9, "a@gmail.com");
        Student student2 = new Student("B", "Nam", "HN",
                dateUtil.convertStringToDate("10/10/1999"), "002", 6, "b@gmail.com");
        students.add(student1);
        students.add(student2);
        Student student = new Student();
        while (true) {
            showMenu1();
            System.out.println("Nhập lực chọn: ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            if (choose == 0)
                break;
            switch (choose) {
                case 1:
                    students = aslistStudent(scanner, students);
                    break;
                case 2:
                    displayListStudent(students);
                    break;
                case 3:
                    student.sortAscending(students);
                    break;
                case 4:
                    student.sortDescending(students);
                    break;
                case 5:
                    checkStdentShip(scanner, students);
                    break;
                default:
                    System.out.println("Nhập không đúng, xin nhập lại: ");
                    break;

            }
        }
    }

    public static List<Student> aslistStudent(Scanner scanner, List<Student> students) throws ParseException {
        Student student = new Student();
        System.out.println("Nhập số lượng sinh viên: ");
        int numberOfStudent = scanner.nextInt();
        scanner.nextLine();
        int i = 0;
        while (i < numberOfStudent) {
            System.out.println("Nhập thông tin sinh viên " + (i+1) + ":");
            students.add(student.insertInfor(scanner));
            i++;
        }
        return students;
    }

    public static void displayListStudent(List<Student> students) {
        for (Student student : students) {
            student.displayInfor(student);
        }
    }

    public static void checkStdentShip(Scanner scanner, List<Student> students) {
        Student student = new Student();
        student = student.getById(scanner, students);
        student.checkStudentShip(student);
    }
}
