package baitapjava8.bai4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumber {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, -100, 100).toArray();
        Set<Integer> result = new HashSet<>();
        Arrays.stream(array).forEach(n -> {
            if(checkEvenNumber(n) == true && checkSumIsDivisibleBy9(n) == true) {
                result.add(n);
            }
        });
        result.forEach(n -> System.out.println(n));
    }

    public static boolean checkSumIsDivisibleBy9(int n) {
        int sum = 0;
        int m = Math.abs(n);
        while (m > 0) {
            sum += m%10;
            m = m/10;
        }
        if(sum % 9 == 0)
            return true;
        return false;
    }

    public static boolean checkEvenNumber(int n) {
        if(n % 2 == 0)
            return true;
        return false;
    }
}
