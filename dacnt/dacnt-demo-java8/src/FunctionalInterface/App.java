package FunctionalInterface;

public class App {
	public static void main(String[] args) {
		
		Action action = new Action();
		Cartoon cartoon = new Cartoon();
		Horror horror = new Horror();
		
		action.Detail();
		cartoon.Detail();
		horror.Detail();
	}
}
