package stream.api.preJV8;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> tempt = new ArrayList<Integer>();
		int sum = 0;
		intList.add(18);
		intList.add(36);
		intList.add(10);
		intList.add(-18);
		intList.add(9);
		intList.add(22);
		intList.add(99);
		intList.add(55);
		intList.add(-7);
		intList.add(54);
		tempt.add(0);
		
		for (Integer i : intList) {
			if (i % 18 == 0 && !tempt.contains(i)) {
				sum += i;
				tempt.add(i);
			}
		}
		
		System.out.println(sum);
		
	}

}
