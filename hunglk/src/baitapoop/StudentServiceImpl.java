package baitapoop;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentSevice{
    @Override
    public void add(Scanner scanner, List<Student> students) throws ParseException {
        Student student = new Student();
        System.out.println("Nhập thông tin sinh viên cần thêm: ");
        students.add(student.insertInfor(scanner));
    }

    @Override
    public void update(Scanner scanner, List<Student> students) throws ParseException {
        System.out.println("Nhập mã sinh viên cần sửa: ");
        String id = scanner.nextLine();
        int length = students.size();
        boolean check = false;
        for (int i = 0; i < length; i++) {
            if (students.get(i).getId().equals(id)) {
                check = true;
                Student student = new Student();
                students.set(i, student.insertInfor(scanner));
            }
        }
        if (check == false) {
            System.out.println("Sinh viên không tồn tại");
        }
    }

    @Override
    public void delete(List<Student> students, String id) {
        int length = students.size();
        boolean check = false;
        for ( Student student : students) {
            if(student.getId().equals(id)) {
                check = true;
                students.remove(student);
            }
        }
        if (check == false) {
            System.out.println("Sinh viên không tồn tại");
        }
    }

    @Override
    public void display(List<Student> students) {
        for (Student student : students) {
            student.displayInfor(student);
        }
    }

    @Override
    public void findById(List<Student> students, String id) {
        int length = students.size();
        boolean check = false;
        for ( Student student : students) {
            if(student.getId().equals(id)) {
                student.displayInfor(student);
            }
        }
        if (check == false) {
            System.out.println("Sinh viên không tồn tại");
        }
    }
}
