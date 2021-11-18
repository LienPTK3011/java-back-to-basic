package LambdaExpression;

import FunctionalInterface.Movie;

public class demo{
	
	public static void main(String[] args) {
		Movie movie = () -> {
			System.out.println("Override Functional Interface");
		};
		movie.Detail();
	}

}
