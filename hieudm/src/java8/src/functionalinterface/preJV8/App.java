package functionalinterface.preJV8;

public class App {
	
	public static void main(String[] args) {
		
		Action action = new Action();
		action.detail();
		
		Horror horror = new Horror();
		horror.detail();
		
		Cartoon cartoon = new Cartoon();
		cartoon.detail();
		
	}
}
