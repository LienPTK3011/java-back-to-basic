package oop;

import java.text.ParseException;
import java.util.List;

public interface StudentService {
    public void add(List<Student> student) throws ParseException;
    public void update(List<Student> student) throws ParseException;
    public void showData(List<Student> student);
}
