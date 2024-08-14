package org.javacore.btjava;

public class Dog {
 String name;
 String giongLoai;

    public Dog() {

    }

    public void inFoDog() {
     System.out.println(name + " " + giongLoai);
 }

    public Dog(String name, String giongLoai) {
        this.name = name;
        this.giongLoai = giongLoai;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiongLoai(String giongLoai) {
        this.giongLoai = giongLoai;
    }

    public String getName() {
        return name;
    }

    public String getGiongLoai() {
        return giongLoai;
    }
}
