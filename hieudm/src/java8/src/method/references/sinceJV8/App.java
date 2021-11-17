package method.references.sinceJV8;

public class App {

	public static void main(String[] args) {
		
		Movie action = System.out::println;
		Movie horror = System.out::println;
		Movie cartoon = System.out::println;
		
		action.detail("Mostly shooting and killing!");
		horror.detail("Jump scare!");
		cartoon.detail("Animation");
		
	}

}
