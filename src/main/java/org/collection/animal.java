package org.collection;

public abstract class animal {
    private  String name;
    private Integer age;

    public  abstract  void speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
