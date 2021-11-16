package baitapoop;

import java.text.ParseException;
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

    public void insertInfor(Scanner scanner, Person person) throws ParseException {
        System.out.println("Nhập tên: ");
        person.setName(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        person.setSex(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        person.setAddress(scanner.nextLine());
        System.out.println("Nhập ngày sinh(dd/MM/yyyy): ");
        DateUtil dateUtil = new DateUtil();
        Date birthday = dateUtil.convertStringToDate(scanner.nextLine());
        person.setBirthday(birthday);
    }

    public String displayInfor() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
