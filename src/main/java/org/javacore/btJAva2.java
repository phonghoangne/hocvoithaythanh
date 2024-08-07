package org.javacore;
import java.util.Scanner;
public class btJAva2 {

    public static int  ucln(int a , int b) {
        while(b !=0) {
            int temp  = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int bcnn(int a , int b) {
        return a * b/ucln(a,b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen duong a : ");
        int a = sc.nextInt();
        System.out.println("nhap so nguyen duong b : ");
        int b = sc.nextInt();
        if(a <= 0 || b <= 0) {
            System.out.println("cac so nhap vao phai la so nguyen duong");
        }else {
            int bcnn = bcnn(a,b);
            System.out.println("boi so chung nho nhat cua "+ a + " va " + b + " la :" + bcnn);
        }
    }

}
