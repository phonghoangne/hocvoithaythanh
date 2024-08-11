package org.collection;

public class dog extends animal{

    public dog(String name,Integer age){
        setName(name);
        setAge(age);
    }
    @Override
    public void speak() {
        System.out.println("dog eat");
    }
}
