package optional.sinceJV8;

import java.util.Optional;

public class App {

	public static void main(String[] args) {
		
		Optional<People> people = Optional.ofNullable(null);
		people.ifPresentOrElse(
				p -> System.out.println(p.getName()),
				() -> System.out.println("Null DUDE!")
				);
	}

}
