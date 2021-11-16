package oop;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOopPolymorphism {
	
	public static void MenuOopPolymorphism() {
        System.out.println("1.Thêm mới sinh viên");
        System.out.println("2.Hiển thị danh sách sinh viên");
        System.out.println("3.Học bỏng");
        System.out.println("0.Thoát");
    }

    public static void main(String[] args) throws ParseException {
    	Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        while (true) {
        	MenuOopPolymorphism();
            System.out.println("Lựa chọn: ");
            int value = sc.nextInt();
            if (value == 0)
                break;
            switch (value) {
                case 1:
                    students = listStudent(students);
                    break;
                case 2:
                	showData(students);
                    break;
                case 3:
                	checkScholarship(students);
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
                    break;
            }
        }
    }

    public static List<Student> listStudent(List<Student> students) throws ParseException {
    	int i= 0;
    	Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Nhập số lượng sinh viên: ");
        int number = sc.nextInt();
        sc.nextLine();
        while (i < number) {
            System.out.println("Nhập thông tin sinh viên " + (i+1) + ":");
            students.add(student.insertInformation());
            i++;
        }
        return students;
    }

    public static void showData(List<Student> students) {
        for (Student student : students) {
            student.displayInformation(student);
        }
    }

    public static void checkScholarship(List<Student> students) {
        Student student = new Student();
        student = student.getById(students);
        student.checkScholarship(student);
    }
}
