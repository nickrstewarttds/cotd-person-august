package com.qa.community;

public class Runner {
    public static void main(String[] args) {

        // this completes task (3)
        Person p = new Person("Cyrus", 32, "drummer");
        Person p2 = new Person("Joseph", 32, "storyteller");

        // this completes task (4)
        PersonManager manager = new PersonManager();
        manager.addPerson(p);
        manager.addPerson(p2);
        manager.addPerson(new Person("Jeff", 32, "bassist"));
        manager.addPerson(new Person("John", 52, "songwriter"));
        manager.addPerson(new Person("Matt", 49, "saxophonist"));

        // this completes task (5)
        manager.findByName("Jeff");
        manager.findByName("Cyrus");
        manager.findByName("Cecil");

        // this completes task (6)
        manager.getAllPeople();
    }
}