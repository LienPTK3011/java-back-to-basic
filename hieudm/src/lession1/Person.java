package lession1;

import java.util.Scanner;

public class Person {

	private String name;
	private String sex;
	private String address;
	private String birthday;
	
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
	public Person() {
		super();
	}
	public Person(String name, String sex, String address, String birthday) {
		super();
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday;
	}
	Scanner scanner = new Scanner(System.in);
	
	void input() {
		System.out.println("Nhập tên: ");
		this.name = scanner.nextLine();
		System.out.println("Nhập giới tính: ");
		this.sex = scanner.nextLine();
		System.out.println("Nhập địa chỉ: ");
		this.address = scanner.nextLine();
		System.out.println("Nhập ngày sinh: ");
		this.birthday = scanner.nextLine();
	}

	void show() {
		System.out.println(
				"****************" + "\n" +
				"Name: " + this.name + "\n" +
				"Sex: " + this.sex + "\n" +
				"Address: " + this.address + "\n" +
				"Birth day: " + this.birthday
				);
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\n" +
		"Sex: " + this.sex + "\n" +
		"Address: " + this.address + "\n" +
		"Birth day: " + this.birthday + "\n";
	}
}
