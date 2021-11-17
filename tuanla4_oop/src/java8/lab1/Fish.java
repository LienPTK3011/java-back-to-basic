package lab1;

public class Fish implements Animal{

	@Override
	public void eat() {
		System.out.println("Fish eat");	
	}

	@Override
	public void breath() {
		System.out.println("Fish breath");	
	}
}
