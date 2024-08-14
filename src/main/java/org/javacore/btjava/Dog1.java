package org.javacore.btjava;

public class Dog1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bin","Pitpull");
        dog1.inFoDog();
        dog1.setGiongLoai("Chiwawa");
        dog1.inFoDog();
        System.out.println(dog1.getName());
        System.out.println(dog1.getGiongLoai());

    }

}

