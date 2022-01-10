/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.introduceException;

import java.io.FileReader;

/**
 *
 * @author Asus
 */
public class SomeExceptions {
// Demo trình bày 1 số ngoại lệ
    public static void main(String[] args) {

        //ArithmeticException 
        int testArithmeticException = 10 / 0;

        //NullPointerException 
        String testNullPointerException = null;
        System.out.println(testNullPointerException.length());

        //NumberFormatException 
        String testNumberFormatException = "tuan";
        int i = Integer.parseInt(testNumberFormatException);

        //ArrayIndexOutOfBoundsException 
        int a[] = new int[5];
        a[10] = 50;
        
        //FileNotFoundException
//         FileReader f = new FileReader("lỗi ko có file");
    }
}
