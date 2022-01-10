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
public class commandBlock {
// Demo các khối lệnh
    public static void main(String[] args) {
        // Khối try-catch.
        try {
            // Khối try: bên trong sẽ là code xử lý có thể xảy ra ngoại lệ
            int a = 10 / 0;
        } catch (ArithmeticException ex) {
            // Khối catch: nơi xử lý ngoại lệ
            System.out.println(ex);
        }
        // Đa khối catch
        try {
            // Trong code xử lý có 2 ngoại lệ
            int a[] = new int[5];
            a[6] = 30 / 0;
        } catch (ArithmeticException ari) {
            System.out.println("ngoại lệ số");
        } catch (ArrayIndexOutOfBoundsException array) {
            System.out.println("ngoại lệ mảng");
        } catch (Exception ex) {
            System.out.println("common task completed");
        }
        System.out.println("rest of the code...");
        // try lồng nhau
        try {
            try {
                System.out.println("Phép chia -.-");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("khoi lenh khac");
        } catch (Exception e) {
            System.out.println("xy ly ngoai le");
        }
        System.out.println("tiep tuc chuong trinh..");
        // khối finally
        try {
            int x = 0;
            int y = 10;
            int num = y / x;
            return;
        } catch (Exception ex) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("next-statement: Outside of try-catch");
    }
}
