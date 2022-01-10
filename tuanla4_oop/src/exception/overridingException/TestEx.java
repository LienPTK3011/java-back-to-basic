/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.overridingException;

import java.io.IOException;

/**
 *
 * @author Asus
 */
public class TestEx extends overriding {
// Demo overriding
// Có thể ném ra uncheck nếu không khai báo ở lớp cha
    @Override
    void message() throws ArithmeticException {
        System.out.println("test");
    }
// Không thể ném ra check nếu không khai báo ở lớp cha
//    @Override
//    void message() throws IOException {
//        System.out.println("test");
//    }
   
// Nếu cha được ném ra ex thì ex con chỉ có thể là lớp tương tự hoặc con của ex cha   
//    @Override
//    void message() throws Exception {
//        System.out.println("test");
//    }

    public static void main(String[] args) {
        overriding o = new TestEx();
        o.message();
    }
}
