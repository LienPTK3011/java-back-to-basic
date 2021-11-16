package oop;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCrud {
	 public static void MenuCrud(){
	        System.out.println("1.Thêm mới sinh viên");
	        System.out.println("2.Thay đổi thông tin dinh viên");
	        System.out.println("3.Hiển thị danh sách sinh viên:");
	        System.out.println("0.Thoát");
	    }

	    public static void main(String[] args) throws ParseException {
	        Scanner sc = new Scanner(System.in);
	        List<Student> students = new ArrayList<>();
	        StudentImpl studentService = new StudentImpl();
	        while (true) {
	        	MenuCrud();
	            System.out.println("Lựa chọn: ");
	            int value = sc.nextInt();
	            if (value == 0)
	                break;
	            switch (value) {
	                case 1:
	                    studentService.add(students);
	                    break;
	                case 2:
	                    studentService.update(students);
	                    break;
	                case 3:
	                    studentService.showData(students);
	                    break;
	                default:
	                    System.out.println("Vui lòng nhập lại");
	                    break;
	            }
	        }
	    }
}
