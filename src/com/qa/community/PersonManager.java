package com.qa.community;

import java.util.ArrayList;
import java.util.List;

// this completes task (4)
public class PersonManager {

    private List<Person> people = new ArrayList<>();

    public void addPerson(Person p) {
        this.people.add(p);
    }

    public void addPerson(String name, int age, String jobTitle) {
        this.people.add(new Person(name, age, jobTitle));
    }

    public void removePerson(Person p) {
        this.people.remove(p);
    }

    // this completes task (5)
    public Person findByName(String name) {
        for (Person p : people) {
            if (p.getName().equals(name)) {
                System.out.println(String.format("person found: %s", p));
                return p;
            }
        }
        System.out.println("person not found");
        return null;
    }

    // this completes task (6)
    public void getAllPeople() {
        people.stream().forEach(p -> System.out.println(p));
    }

}