package org.javacore.btjava;

public class PerSon {
    public String name;
    public int age;

    public PerSon(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void inFo(){
        System.out.println("Info : " + this.name + " " + this.age);
    }
}
