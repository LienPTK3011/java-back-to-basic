package Optional;

import java.util.List;
import java.util.Optional;

public class App {
	public static void main(String[] args) {
		List<People> list = null;
		Optional<List<People>> people = Optional.ofNullable(list);
		people.ifPresent(a -> System.out.println(a.get(0).getName()));
		}
}
