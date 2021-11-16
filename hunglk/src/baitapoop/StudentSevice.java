package baitapoop;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public interface StudentSevice {
    public void add(Scanner scanner, List<Student> students) throws ParseException;
    public void update(Scanner scanner, List<Student> student) throws ParseException;
    public void delete(List<Student> students, String id);
    public void display(List<Student> students);
    public void findById(List<Student> students, String id);
}
