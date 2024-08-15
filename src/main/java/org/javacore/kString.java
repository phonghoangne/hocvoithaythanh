package org.javacore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class kString {
    public static void main(String[] args)
    {

        String aString = " Hello Thanh ";// ax8bjo
        aString = "hhelo 1";// ax9sjo
        System.out.println(aString);
        StringBuilder sql = new StringBuilder("Hello Thanh "); //ax900k
        sql.append(" World append");
        sql = new StringBuilder("Chis Thanh");//ax900k
        System.out.println(sql.toString());

//        System.out.println(aString.toLowerCase());
//        System.out.println(aString.toUpperCase());
//        System.out.println(aString.charAt(1));
//        System.out.println(aString.substring(2));
//        System.out.println(aString.substring(2,4));
//        System.out.println(aString.indexOf("e"));
//        System.out.println(aString.trim());
////        System.out.println(aString.split(""));
//        String bString = " Hello Thanh ";
//
//        System.out.println(aString.equals(bString));
//
//        System.out.println(aString == bString);

        String a1 = "Hello1";
        String a2= "Hello22";
        System.out.println(a1.compareTo(a2));
       String[] names = {"Alicesssssss","ThanhNC","PhongHV3123"};
       Arrays.sort(names, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return Integer.compare(o2.length(),o1.length());
           }
       });
        System.out.println(Arrays.toString(names));
    }

}
