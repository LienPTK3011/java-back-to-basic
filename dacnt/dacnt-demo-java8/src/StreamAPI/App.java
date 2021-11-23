package StreamAPI;

import java.util.ArrayList;
import java.util.List;

// đã bao gồm cả phần method references
public class App {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		random(arr);
		
		arr.stream().forEach(System.out::println);
		
		int sum = arr.stream()
		.filter(x -> x % 2 == 0 && x % 9 == 0)
		.reduce(0, (o1, o2) -> o1 + o2);
		System.out.println(sum);
	}

	static void random(List<Integer> arr) {
        for (int i=0; i<10; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            arr.add(randomInt);
        }
	}
	
}
