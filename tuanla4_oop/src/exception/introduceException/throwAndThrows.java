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
public class throwAndThrows {
// Demo throw và throws
    static void fun() throws IllegalAccessException {
        System.out.println("Trong fun");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) throws IllegalAccessException {

        int a = 5;
        if (a < 6) {
            throw new ArithmeticException("bắn ra một thông báo");
        } else {
            System.out.println("không thì thôi");
        }
        fun();
        System.out.println("Trong main");

    }
}
