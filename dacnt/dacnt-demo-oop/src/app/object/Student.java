package app.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.repository.StudentRepository;

public class Student extends Person implements StudentRepository{
	
	private Integer msv;
	
	private Integer diemtb;
	
	private String email;

	public Integer getMsv() {
		return msv;
	}

	public void setMsv(Integer msv) {
		this.msv = msv;
	}

	public Integer getDiemtb() {
		return diemtb;
	}

	public void setDiemtb(Integer diemtb) {
		this.diemtb = diemtb;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String name, String sex, String address, String birthday, Integer msv, Integer diemtb, String email) {
		super(name, sex, address, birthday);
		this.msv = msv;
		this.diemtb = diemtb;
		this.email = email;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Student [msv=" + msv + ", diemtb=" + diemtb + ", email=" + email + "]";
	}

	@Override
	public void addStudent(List<Student> students) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("nhap email");
		student.setEmail(scanner.nextLine());
		
		System.out.println("Nhap ten student: ");
        student.setName(scanner.nextLine());
        
        System.out.println("Nhap gioi tinh : ");
        student.setSex(scanner.nextLine());
        
        System.out.println("Nhap dia chi : ");
        student.setAddress(scanner.nextLine());
        
        System.out.println("Nhap ngay sinh ");
        student.setBirthday(scanner.nextLine());
        
        System.out.println("Nhap msv ");
        student.setMsv(scanner.nextInt());
        
        System.out.println("nhap diem tb ");
        student.setDiemtb(scanner.nextInt());
        
        System.out.println("student added !");
        students.add(student);
	}

	@Override
	public void printStudent(List<Student> students) {
		// TODO Auto-generated method stub
		for( int i = 0; i < students.size(); i++) {
			System.out.println( students.get(i).toString());
		}
	}
}
