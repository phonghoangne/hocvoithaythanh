package org.javacore.btjava;
import java.util.ArrayList;
import  java.util.List;
public class collection {
    public static void main(String[] args) {
        List<Integer>  arrays = new ArrayList<>();
        arrays.add(1);
        arrays.add(2);
        arrays.add(3);
        System.out.println(arrays.size());
        arrays.add(1,4);
        // 1 la cho add vao 4 la phan tu .
        arrays.clear();
        // xoa het tat ca phan tu trong mang
        arrays.remove(1);

      // remove theo index
        // ham kiem tra xem co rong hay khong
        System.out.println(arrays.isEmpty());
        // arraylist con the luu 1 tap cac object
        List<Dog> listDog =  new ArrayList<>();
        listDog.add(new Dog("lu","nguoi"));
        listDog.add(new Dog("lu2","cho"));
        listDog.add(new Dog("lu3","nguoi"));
        for(Integer i : arrays){
            System.out.println(i);
        }
        Dog lu = new Dog();
        Dog lu2 = new Dog("hung","nguoi");
    }
}
