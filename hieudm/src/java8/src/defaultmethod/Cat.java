package defaultmethod;

public class Cat implements Animal {

	@Override
	public void breath() {
		System.out.println("Cat is breathing");
	}

	@Override
	public void eat() {
		System.out.println("Cat is eatting");
	}
	
	@Override
	public void run() {
		System.out.println("Cat is running");
	}

}
