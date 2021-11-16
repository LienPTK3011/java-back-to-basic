package baitapjava8.bai6;

import baitapoop.Person;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<People> people = null;
        if(people != null) {
            people.forEach(person -> System.out.println(person.getName()));
        }
    }
}
