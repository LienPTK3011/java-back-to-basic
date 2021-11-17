package lab2;

public class Lab3 {
	public static void main(String args[]) {
	   int number = 10;  	
		Movie mv = () -> {
			System.out.println("Movie "+ number);  
    	};
    	mv.detail();
	}
}
