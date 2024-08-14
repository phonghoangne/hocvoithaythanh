package org.OOP;

public class Person extends PersonParent
{
    private String address;

    public Person()
    { }
/*Tạo 1 arraylist lưu danh sách person
thêm 5 phần tử person vào arraylist vừa rồi
truy cập phần tử thứ 2.*/

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

    @Override
    public String toString() {
        return "Person: " +" Name: " + name + " Age: " + age + " Address: " + address ;
    }
}
