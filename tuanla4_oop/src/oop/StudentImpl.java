package oop;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements StudentService{
	   Scanner sc = new Scanner(System.in); 
	   @Override
	    public void add(List<Student> students) throws ParseException {
	        Student student = new Student();
	        System.out.println("Nhập thông tin sinh viên : ");
	        students.add(student.insertInformation());
	    }

	    @Override
	    public void update(List<Student> students) throws ParseException {
	        System.out.println("Nhập mã số sinh viên: ");
	        String idCheck = sc.nextLine();
	        boolean checkValue = false;
	        for (int i = 0; i < students.size(); i++) {
	            if (students.get(i).getId().equalsIgnoreCase(idCheck)) {
	            	checkValue = true;
	                Student student = new Student();
	                students.set(i, student.updateInformation(students.get(i).getId()));
	            }
	        }
	        if (checkValue == false) {
	            System.out.println("Sinh viên không toogn tại");
	        }
	    }

	    @Override
	    public void showData(List<Student> student) {
	        for (Student students : student) {
	        	students.displayInformation(students);
	        }
	    }
}
