package org.javacore;

import java.security.spec.RSAOtherPrimeInfo;

public class Dog extends Animals {
public Dog(String name, int chieucao, float cannang) {
    super(name, chieucao, cannang);
};
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void drink() {
        System.out.println("Drink");
    }

    @Override
    public void noise() {
        System.out.println("gau gau");

    }
}
