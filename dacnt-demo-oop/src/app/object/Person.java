package app.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.repository.PersonRepository;

public class Person implements PersonRepository{
	
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

	public Person(String name, String sex, String address, String birthday) {
		super();
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "name = " + name + ", sex = " + sex + ", address = " + address + ", birthday = " + birthday;
	}

	@Override
	public void addPerson(List<Person> persons) {
		// TODO Auto-generated method stub
		Person person = new Person();
		Scanner scanner = new Scanner(System.in);
        System.out.println("Chuc nang nhap person !");
    	System.out.println("Nhap ten person: ");
        person.setName(scanner.nextLine());
        System.out.println("Nhap gioi tinh : ");
        person.setSex(scanner.nextLine());
        System.out.println("Nhap dia chi : ");
        person.setAddress(scanner.nextLine());
        System.out.println("Nhap ngay sinh ");
        person.setBirthday(scanner.nextLine());
        System.out.println("Person added !");
        persons.add(person);
	}

	@Override
	public void printPerson(List<Person> persons) {
		// TODO Auto-generated method stub
		for(int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).toString());
		}
	}
}
