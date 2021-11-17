package defaultmethod;

public interface Animal {
	
	void breath();
	void eat();
	
	default void run() {}
	
}
