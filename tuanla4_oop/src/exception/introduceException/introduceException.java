/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.introduceException;

/**
 *
 * @author Asus
 */
public class introduceException {
// Demo giải thích ngoại lệ
    public static void main(String[] args) {
        try {
            int a = 6;
            int b = 1;
            int c = 0;
            int output = a / b;
            System.out.println("output lần 1: " + output);
            int output2 = a / c;
            System.out.println("output lần 2: " + output2);
            int output3 = a / b;
            System.out.println("output lần 3: " + output3);
        } catch (ArithmeticException ex) {
            System.out.println("Bắn ra ngoại lệ " + ex);
        }
        System.out.println("Luồng chạy ngon và bắn ra kết quả");

    }
}
