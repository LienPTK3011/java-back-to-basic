package functionalinterface.lambda.sinceJV8;

public class App {

	public static void main(String[] args) {
		
		Movie action = () -> System.out.println("Mostly shooting and killing!");
		Movie horror = () -> System.out.println("Jump scare!");
		Movie cartoon = () -> System.out.println("Animation");
		
		action.detail();
		horror.detail();
		cartoon.detail();
		
	}

}
