package org.javacore;
import java.util.Scanner;
public class menTor {
    public static void main (String[] args ){
       /* int[] arr = {1,2,3,4,5};
        System.out.println(arr[1]);
        for( int i=0;i <arr.length;i++) {
            System.out.println(arr[i]);
        }*/
        Scanner sc = new Scanner(System.in);
         
        System.out.println("nhap so luong mang");
        int n = sc.nextInt();
        int[] abc = new int[n];


        for (int i = 0; i < abc.length; i++){
            System.out.println("Nhap so thu " + i + "trong array" );
            abc[i] = sc.nextInt();
        }
        for (int i = 0; i < abc.length; i++){
            System.out.println("a[" + i + "] = " + abc[i] );

        }

    }
}
