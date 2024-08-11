package org.OOP;

public class Person extends PersonParent
{
    private String address;

    public Person()
    { }

    public Person(int id,String name, int age, String address) {
        this.id= id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public void printInfor() {
        System.out.println("Person: " +" Name: " + name + " Age: " + age + " Address: " + address);
    }

}
