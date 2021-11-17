package defaultmethod;

public class Fish implements Animal {
	
	@Override
	public void breath() {
		System.out.println("Fish is breathing");
	}
	
	@Override
	public void eat() {
		System.out.println("Fish is eatting");
	}
	
	/**
	 * Fish doesn't run, they swim
	 */

}
