package baitapoop;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu2 {
    public static void showMenu1() {
        System.out.println("1. Thêm sinh viên mới");
        System.out.println("2. Sửa sinh viên");
        System.out.println("3. Xóa sinh viên");
        System.out.println("4. Tìm kiếm theo Mã:");
        System.out.println("5. Hiển thị dánh sách:");
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
        StudentServiceImpl studentService = new StudentServiceImpl();
        while (true) {
            showMenu1();
            System.out.println("Nhập lực chọn: ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            if (choose == 0)
                break;
            switch (choose) {
                case 1:
                    studentService.add(scanner, students);
                    break;
                case 2:
                    studentService.update(scanner, students);
                    break;
                case 3:
                    System.out.println("Nhập mã sinh viên cần xóa: ");
                    String id = scanner.nextLine();
                    studentService.delete(students, id);
                    break;
                case 4:
                    System.out.println("Nhập mã sinh viên: ");
                    String idStudent = scanner.nextLine();
                    studentService.findById(students, idStudent);
                    break;
                case 5:
                    studentService.display(students);
                    break;
                default:
                    System.out.println("Nhập không đúng, xin nhập lại: ");
                    break;
            }
        }
    }
}
