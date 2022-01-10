package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import app.object.*;
public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Person> persons = new ArrayList<Person>();
		List<Student> students = new ArrayList<Student>();
		
//		Person person = new Person();
//		person.addPerson(persons);
//		person.printPerson(persons);
		addRandomStudent(students);
		Student student = new Student();
//		student.addStudent(students);
		
		System.out.println();
		System.out.println("sort tu thap den cao ");
		students = students.stream()
				.sorted((o1, o2) -> o1.getDiemtb().compareTo(o2.getDiemtb()))
				.collect(Collectors.toList());
		student.printStudent(students);

		
		System.out.println();
		System.out.println("sort tu cao den thap ");
		students = students.stream()
				.sorted((o1, o2) -> o2.getDiemtb().compareTo(o1.getDiemtb()))
				.collect(Collectors.toList());
		student.printStudent(students);
		
		System.out.println();
		System.out.println("nhap ma sinh vien");
		Integer msv = scanner.nextInt();
		student = students.stream()
						.filter(s -> s.getMsv() == msv)
						.reduce((a, b) -> {
				            throw new IllegalStateException("Multiple elements: " + a + ", " + b);
				        })
				        .get();
		if(student.getDiemtb() >= 80) {
			System.out.println("Điểm tb : " + student.getDiemtb() + " Được học bổng");
			}else System.out.println("Điểm tb : " + student.getDiemtb() + " Cần cố gắng hơn");
		}
	
	static void addRandomStudent(List<Student> students) {
		for(int i = 0; i < 10; i++) {
			Student student = new Student();
			double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int random = (int) randomDouble;
			student.setName("student" + i);
			student.setSex("nam");
			student.setAddress("ha noi");
			student.setBirthday("32189312");
			student.setEmail("duyas@gmail.com");
			student.setMsv(random * 2 + 3219);
			student.setDiemtb(random);
			students.add(student);
		}
	}
	
	static void comment(Student student) {
		if(student.getDiemtb() >= 80) {
			System.out.println("Điểm tb : " + student.getDiemtb() + " Được học bổng");
		}else System.out.println("Điểm tb : " + student.getDiemtb() + " Cần cố gắng hơn");
	}
}
