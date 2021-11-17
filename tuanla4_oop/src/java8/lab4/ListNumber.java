package java8.lab4;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ListNumber {
	public static void main(String[] args) {
		int[] a =  new Random().ints(-100,100).limit(10).toArray();
		Set<Integer> set = new TreeSet<>();
        Arrays.stream(a).forEach(n -> {
            if(findEvenNumber(n) == true && checkDivisible(n) == true) {
            	set.add(n);
            }
        });
         List<Integer> newList = set.stream().collect(Collectors.toList());
         if(newList.isEmpty()) {
        		System.out.println("Không có giá trị thỏa mãn"); 
         }else {
             newList.forEach(n -> {
         		System.out.println(n);
             }
            ); 
         }
	}
	
	public static boolean findEvenNumber(int n) {
		if(n % 2 == 0) {
			return true;
		}else{
	        return false;
	    }
    }
	
	public static boolean checkDivisible(int n) {
		int rem = 0;
	    int sum = 0;
	    int a = Math.abs(n);
	    while (a > 0) {
	    	rem = a % 10;
	        sum += rem;
	        a = a / 10;
	    }
	    if(sum % 9 == 0) {
	    	 return true;	
	    }else {
	         return false;
	    }
    }
}
