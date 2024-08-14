package org.OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> person1 = new ArrayList<>();
        Person phong = new Person(2001,"phong",23,"nhatban");

        person1.add(phong);
        person1.add(new Person(2002,"thanh1",22,"thuduc"));
        person1.add(new Person(2002,"thanh2",22,"thuduc"));
        person1.add(new Person(2002,"thanh3",22,"thuduc"));
        person1.add(new Person(2002,"thanh4",22,"thuduc"));
        System.out.println(person1.get(1));
        person1.remove(person1.size()-2);
        for (Person p : person1) {
            System.out.println(p);
        }
        
    }
}