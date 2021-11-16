package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String name;
    private String sex;
    private String address;
    private Date birthday;
    
    public Person() {
    }

    public Person(String name, String sex, String address, Date birthday) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.birthday = birthday;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Date convertStringToDate(String date) throws ParseException {
        SimpleDateFormat formatter =new SimpleDateFormat("dd-MM-yyyy");
        return formatter.parse(date);
	}
	
	Scanner sc = new Scanner(System.in);
	public void insertInformation(Person person) throws ParseException {
	    System.out.println("Nhập tên: ");
	    person.setName(sc.nextLine());
	    System.out.println("Nhập giới tính: ");
	    person.setSex(sc.nextLine());
	    System.out.println("Nhập địa chỉ: ");
	    person.setAddress(sc.nextLine());
	    System.out.println("Nhập ngày sinh dạng dd-MM-yyyy: ");
	    Date birthday = convertStringToDate(sc.nextLine());
	    person.setBirthday(birthday);
	}
	
	public String displayInformation() {
	    return "{" + "tên='" + name + '\'' + ", giới tính='" + sex + '\'' +
	            ", địa chỉ='" + address + '\'' + ", ngày sinh=" + birthday +
	           '}';
	}

    
}
