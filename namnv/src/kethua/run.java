package kethua;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class run {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        do {
            int choice = menu();
            if (choice == 1) {
                studentList.add(inputData(choice));
                System.out.println("Thêm thông tin");
            } else if (choice == 2 && studentList.size() != 0) {
                System.out.println(studentList.size());
                displayData(studentList);
            } else if (choice == 3 && studentList.size() != 0) {
                System.out.println("Nhập tên sinh viên cần xóa:");
                String name = sc.nextLine();
                Boolean result = delete(studentList, name);
                System.out.println(name);
                if (result) {
                    System.out.println("Xóa thành công");
                    displayData(studentList);
                } else {
                    System.out.println("Không thành công");
                }
            } else {
                System.out.println("Choice  again (1 -> 3)");
            }
        } while (true);
    }
    public static int menu(){
        int choice;
        System.out.println("***********Quản lý sinh viên***********");
        System.out.println("1: Input data");
        System.out.println("2: Display data");
        System.out.println("3: Delete By Name");
        System.out.println("your choose : ");
        choice= sc.nextInt();sc.nextLine();
        return choice;

    }
    public static Student inputData(int choice){
        Student student = new Student();
        switch (choice){
            case 1:
                //input data
                student   =  setDataStudent();
                break;
            case 2:
                //displayData();
                break;
        }
        return student;
    }
    public static Student setDataStudent(){
        Student student = new Student();
        System.out.println("Name : ");
        student.setName( sc.nextLine());
        return student;
    }

    public static void displayData(List<Student> lst) {
        for (int i =0 ;i<lst.size(); i++){
            System.out.println("Information sv "+ i);
            System.out.println("Name Student =============> "+lst.get(i).getName());
        }
    }

    public static Boolean delete(List<Student> lst, String name) {
        if (lst != null) {
            for (int i = 0; i < lst.size(); i++) {
                if (lst.get(i).getName().equals(name)) {
                    lst.remove(i);
                    return true;
                }
            }
        }
        return null;
    }
}


