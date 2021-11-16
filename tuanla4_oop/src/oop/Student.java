package oop;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Student extends Person {
   private String id;
   private double score;
   private String email;
   
   public Student() {
   }

   public Student(String name, String sex, String address, Date birthday, String id, double score, String email) {
	   super(name, sex, address, birthday);
	   this.id = id;
	   this.score = score;
	   this.email = email;
   }
   
   public String getId() {
	   return id;
   }

   public void setId(String id) {
	   this.id = id;
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
   public void insertInformation(Person person) throws ParseException {
       super.insertInformation(person);
   }

   Scanner sc = new Scanner(System.in);
   public Student insertInformation() throws ParseException {
       Student student = new Student();
       Person person = new Person();
       insertInformation(person);
       student.setName(person.getName());
       student.setSex(person.getSex());
       student.setAddress(person.getAddress());
       student.setBirthday(person.getBirthday());
       System.out.println("Nhập mã sinh viên: ");
       student.setId(sc.nextLine());
       System.out.println("Nhập điểm của sinh viên: ");
       student.setScore(sc.nextDouble());
       System.out.println("Nhập email sinh viên: ");
       student.setEmail(sc.nextLine());
       return student;
   }
   
   public Student updateInformation(String id) throws ParseException {
       Student student = new Student();
       Person person = new Person();
       insertInformation(person);
       student.setName(person.getName());
       student.setSex(person.getSex());
       student.setAddress(person.getAddress());
       student.setBirthday(person.getBirthday());
       student.setId(id);
       System.out.println("Nhập điểm của sinh viên: ");
       student.setScore(sc.nextDouble());
       System.out.println("Nhập email sinh viên: ");
       sc.nextLine();
       student.setEmail(sc.nextLine());
       return student;
   }

   @Override
   public String displayInformation() {
       return super.displayInformation();
   }

   public void displayInformation(Student student) {
       System.out.println(student.getId() + " " + student.getName() + " " + student.getSex()
           + " " + student.getScore() + " " + student.getAddress() + " " + student.getBirthday() + " "
           + student.getEmail());
   }

   public void checkScholarship(Student student) {
       if(student.getScore() > 8.0) {
           System.out.println("Học bổng");
       } else {
           System.out.println("Cố lên bạn ơi.");
       }
   }

   public Student getById(List<Student> students) {
       System.out.println("Nhập mã sinh viên: ");
       String id = sc.nextLine();
       for (Student student : students) {
           if (student.getId().equals(id)) {
               return student;
           }
       }
       return null;
   }
}
