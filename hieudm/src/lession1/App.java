	package lession1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Van", "male", "TDH", "01011990", "studentId01", 10, "HieuDM"));
		students.add(new Student("Hiu", "male", "TDH", "01011990", "studentId01", 5, "HieuDM"));
		students.add(new Student("ZZZ", "male", "TDH", "01011990", "studentId01", 7, "HieuDM"));
		students.add(new Student("AAA", "male", "TDH", "01011990", "studentId01", 9, "HieuDM"));
		for (Student student : students) {
			student.show();
		}
		Scanner scanner = new Scanner(System.in);
		int opt;
		for (;;) {
			System.out.println("1. Nhập");
			System.out.println("2. Xem");
			System.out.println("3. Sắp xếp");
			System.out.println("4. Kiểm tra học bổng");
			System.out.println("5. Thoát");
			do {
				System.out.println("Bấm số để chọn (1/2/3/4): ");
				opt = scanner.nextInt();
			} while ((opt < 1) || (opt > 5));

			switch (opt) {
			case 1:
				System.out.println("Nhập thông tin Student!");
				Student s = new Student();
				s.input();
				students.add(s);
				break;
			case 2:
				for (Student student : students) {
					student.show();
				}
				break;
			case 3:
				System.out.println("Sap xep!");
				Collections.sort(students, new Comparator<Student>() {
					@Override
					public int compare(Student s1, Student s2) {
						return s1.getAvgscore() - s2.getAvgscore();
					}
				});
				for (Student student : students) {
					student.show();
				}
				break;
			case 4:
				System.out.println("Kiểm tra học bổng!");
				for (Student student : students) {
					student.show();
					System.out.println(student.checkStudentship(student)); 
				}
				break;
			case 5:
				System.out.println("Thoat");
				System.exit(0);
				break;
			}
		}
	}

}
