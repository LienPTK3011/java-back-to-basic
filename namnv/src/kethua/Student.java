package kethua;

import java.util.Scanner;

public class Student extends Person {
    private int idSV;
    private double point;
    private String email;

    Scanner sc =  new Scanner(System.in);
    public int getIdSV() {
        return idSV;
    }

    public void setIdSV(int idSV) {
        this.idSV = idSV;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
