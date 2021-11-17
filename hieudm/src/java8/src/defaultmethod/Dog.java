package defaultmethod;

public class Dog implements Animal {
	
	@Override
	public void breath() {
		System.out.println("Dog is breathing");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog is eatting");
	}
	
	@Override
	public void run() {
		System.out.println("Dog is running");
	}
	
}
