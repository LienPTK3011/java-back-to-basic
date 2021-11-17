package java8.lab6;

import java.util.List;

public class OptionalMain {
	
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        List<People> people = null;
        if (people != null) {
        	people.forEach(person -> System.out.println("Tên các thứ các thứ "+ person.getName()));
        }
    }
}
