package lab1;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("Cat eat");
	}

	@Override
	public void breath() {
		System.out.println("Cat breath");
	}
	
	@Override
	public void run() {
		System.out.println("Cat run");
	}
}
