package abstraction;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opt; 
		Student student = new Student();
		for (;;) {
			System.out.println("1. Thêm");
			System.out.println("2. Sửa");
			System.out.println("3. Xóa");
			System.out.println("4. Show All");
			System.out.println("5. Thoát");
			
			do {
				System.out.println("Bấm số để chọn (1/2/3/4): ");
				opt = scanner.nextInt();
			} while ((opt < 1) || (opt > 5));
			
			switch (opt) {
			case 1:
				student.addStd();
				break;
			case 2:
				student.update();
				break;
			case 3:
				student.delete();
				break;
			case 4:
				student.showall();
				break;
			case 5:
				System.out.println("Thoat");
				System.exit(0);
				break;
			}
		}
	}

}
