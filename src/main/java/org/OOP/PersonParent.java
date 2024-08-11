package org.OOP;

public abstract class PersonParent {

    protected Integer id;
    protected String name;
    protected int age;

    public PersonParent()
    { }

    public PersonParent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void printInfor() ;

    public void speak()
    {
        System.out.println(name+" speaking");
    }
}
