package lession1;

import java.util.Scanner;

public class Student extends Person {

	Scanner scanner = new Scanner(System.in);

	private String studentID;
	private int avgscore;
	private String email;

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getAvgscore() {
		return avgscore;
	}

	public void setAvgscore(int avgscore) {
		this.avgscore = avgscore;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student() {
		super();
	}

	public Student(String name, String sex, String address, String birthday, String studentID, int avgscore,
			String email) {
		super(name, sex, address, birthday);
		this.studentID = studentID;
		this.avgscore = avgscore;
		this.email = email;
	}

	@Override
	public void input() {
		super.input();
		System.out.println("Nhập mã sinh viên: ");
		this.studentID = scanner.nextLine();
		System.out.println("Nhập điểm trung bình: ");
		this.avgscore = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập email: ");
		this.email = scanner.nextLine();
	}

	public void show() {
		super.show();
		System.out.println("Student ID: " + this.studentID + "\n" + "AVG score: "
				+ this.avgscore + "\n" + "Email: " + this.email);
	}

	public String checkStudentship(Student student) {
		if (student.getAvgscore() >= 8) {
			return "Đạt học bổng!!!";
		} else {
			return "Cần cố gắng thêm!!!";
		}
	}

//    @Override
//    public String toString() {
//    	return super.toString() + "Student ID: " + this.studentID + "\n" +
//		"AVG score: " + this.avgscore + "\n" +
//		"Email: " + this.email + "\n";
//    }

}
