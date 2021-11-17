package optional.preJV8;

import java.util.List;

public class App {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
	
		List<People> peopleList = null;
		
////		NPE
//		System.out.println(peopleList.get(0));
		
//		Check null before do anything
		if (null != peopleList) {
			System.out.println(peopleList.get(0));
		} else {
			System.out.println("Null");
		}
		
	}

}
