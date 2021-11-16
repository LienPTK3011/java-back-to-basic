package baitapoop;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Student extends Person{
    private String Id;
    private double score;
    private String email;

    public Student() {
    }

    public Student(String id, double score, String email) {
        Id = id;
        this.score = score;
        this.email = email;
    }

    public Student(String name, String sex, String address, Date birthday, String id, double score, String email) {
        super(name, sex, address, birthday);
        Id = id;
        this.score = score;
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void insertInfor(Scanner scanner, Person person) throws ParseException {
        super.insertInfor(scanner, person);
    }

    public Student insertInfor(Scanner scanner) throws ParseException {
        Student student = new Student();
        Person person = new Person();
        insertInfor(scanner, person);
        student.setName(person.getName());
        student.setSex(person.getSex());
        student.setAddress(person.getAddress());
        student.setBirthday(person.getBirthday());
        System.out.println("Nhập mã sinh viên: ");
        student.setId(scanner.nextLine());
        System.out.println("Nhập điểm của sinh viên: ");
        student.setScore(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Nhập email sinh viên: ");
        student.setEmail(scanner.nextLine());
        return student;
    }

    @Override
    public String displayInfor() {
        return super.displayInfor();
    }

    public void displayInfor(Student student) {
        DateUtil dateUtil = new DateUtil();
        System.out.println(student.getId() + "  " + student.getName() + "   " + student.getSex()
            + " " + student.getScore() + " " + student.getAddress() + "  " + dateUtil.convertDateToString(student.getBirthday()) + "    "
            + student.getEmail());
    }

    public void sortAscending(List<Student> students) {
        int length = students.size();
        for(int i = 0; i < length-1; i++) {
            for(int j = i+1; j < length; j++) {
                if(students.get(i).getScore() < students.get(j).getScore()) {
                    Student temp = new Student();
                    temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);

                }
            }
        }
    }

    public void sortDescending(List<Student> students) {
        int length = students.size();
        for(int i = 0; i < length-1; i++) {
            for(int j = i+1; j < length; j++) {
                if(students.get(i).getScore() > students.get(j).getScore()) {
                    Student temp = new Student();
                    temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);

                }
            }
        }
    }

    public void checkStudentShip(Student student) {
        if(student.getScore() > 8.0) {
            System.out.println("Được học bổng!");
        } else {
            System.out.println("Cần cố gắng hơn.");
        }
    }

    public Student getById(Scanner scanner, List<Student> students) {
        System.out.println("Nhập mã sinh viên: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

}
