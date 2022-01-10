/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.CustomException;

/**
 *
 * @author Asus
 */
public class TestAgeException {

    static void validate(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("em chưa 18 :3");
        } else {
            System.out.println("em 18 r");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (AgeException ex) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured: " + ex);
        }

        System.out.println("rest of the code...");
    }
}
