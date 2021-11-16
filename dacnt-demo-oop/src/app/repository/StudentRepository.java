package app.repository;

import java.util.List;
import app.object.Student;

public interface StudentRepository extends PersonRepository{
	
	void addStudent(List<Student> students);
	
	void printStudent(List<Student> students);
}
