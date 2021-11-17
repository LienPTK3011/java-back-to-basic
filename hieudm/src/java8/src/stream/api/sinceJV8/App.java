package stream.api.sinceJV8;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		
		int sum = IntStream.of(18, 36, 10, -18, 9, 22, 99, 55, -7, 54)
		.distinct()
		.filter(num -> num % 18 == 0)
		.reduce(0, (a, b) -> a + b);
		
		System.out.println(sum);
		
	}

}
