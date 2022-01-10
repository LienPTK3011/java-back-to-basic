package app.repository;
import java.util.List;

import app.object.Person;

public interface PersonRepository {
	
	void addPerson(List<Person> persons);
	
	void printPerson(List<Person> persons);
	
}
