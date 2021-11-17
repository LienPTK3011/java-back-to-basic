package lab1;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog eat");
	}

	@Override
	public void breath() {
		System.out.println("Dog breath");
	}
	
	@Override
	public void run() {
		System.out.println("Dog run");
	}
}
