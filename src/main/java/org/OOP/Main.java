package org.OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        List<Person> persons = new ArrayList<>();

        ServiceImpl service = new ServiceImpl();

        service.insert(new Person(1, "John", 20, "USA"), persons);
        service.insert(new Person(2, "Tom", 25, "UK"), persons);
        service.insert(new Person(3, "Jerry", 30, "France"), persons);

        for (Person person : persons) {
            person.printInfor();
        }

        service.update(new Person(2, "Tommy", 26, "UK"), persons);
        System.out.println("-------------------");
        for (Person person : persons) {
            person.printInfor();
        }

        service.delete(2, persons);
        System.out.println("-------------------");
        for (Person person : persons) {
            person.printInfor();
        }

        Person person = service.findById(1, persons);
        System.out.println("-------------------");
        person.printInfor();
    }
}