package abstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student extends CrudImpl {

	List<Student> studentList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public void addStd() {
		super.add();
		Student std = new Student();
		System.out.println("Nhập tên: ");
		std.name = scanner.nextLine();
//		System.out.println("Nhập giới tính: ");
//		std.sex = scanner.nextLine();
//		System.out.println("Nhập địa chỉ: ");
//		std.address = scanner.nextLine();
//		System.out.println("Nhập ngày sinh: ");
//		std.birthday = scanner.nextLine();
		System.out.println("Nhập mã sinh viên: ");
		std.studentID = scanner.nextLine();
//		System.out.println("Nhập điểm trung bình: ");
//		std.avgscore = Integer.parseInt(scanner.nextLine());
//		System.out.println("Nhập email: ");
//		std.email = scanner.nextLine();
		studentList.add(std);
	}

	public void update() {
		super.update();
		System.out.println("Nhập tên sinh viên: ");
		String name = scanner.nextLine();
		for (Student student : studentList) {
			if (student.getName().equals(name)) {
				studentList.remove(student);
			}
		}
		this.addStd();
	}

	public void delete() {
		super.delete();
		int count = 0;
		System.out.println("Nhập tên sinh viên: ");
		String name = scanner.nextLine();
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getStudentID().equals(name)) {
				studentList.remove(i);
				System.out.println("delete success!!!!");
				count++;
			}
		}
		if (count == 0) System.out.println("Can not find StudentID");
	}

	public void show() {
		super.show();
		int count = 0;
		System.out.println("Nhập mã sinh viên: ");
		String studentID = scanner.nextLine();
		for (Student student : studentList) {
			if (student.getStudentID() == studentID) {
				System.out.println("___Student___" + "\n" + "Name: " + student.getName() + "\n" + "Sex: "
						+ student.getSex() + "\n" + "Address: " + student.getAddress() + "\n" + "Birthday: "
						+ student.getBirthday() + "\n" + "StudentID: " + student.getStudentID() + "\n" + "Avg Score: "
						+ student.getAvgscore() + "\n" + "Email: " + student.getEmail() + "\n");
				count++;
			}
		}
		if (count == 0)
			System.out.println("Can not find StudentID");
	}

	public void showall() {
		for (Student student : studentList) {
			System.out.println("___Student___" + "\n" + "Name: " + student.getName() + "\n" + "Sex: " + student.getSex()
					+ "\n" + "Address: " + student.getAddress() + "\n" + "Birthday: " + student.getBirthday() + "\n"
					+ "StudentID: " + student.getStudentID() + "\n" + "Avg Score: " + student.getAvgscore() + "\n"
					+ "Email: " + student.getEmail());
		}
	}

	private String name;
	private String sex;
	private String address;
	private String birthday;
	private String studentID;
	private int avgscore;
	private String email;
	public List<Student> getStudents() {
		return studentList;
	}
	public void setStudents(List<Student> students) {
		this.studentList = students;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
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
	public Student(String name, String sex, String address, String birthday, String studentID, int avgscore,
			String email) {
		super();
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday;
		this.studentID = studentID;
		this.avgscore = avgscore;
		this.email = email;
	}
	public Student() {
		super();
	}

}
