package org.javacore;

public class tinhTongsoduong {
    // cho mảng {1, -2, 3, 3, 4} tính tổng các số dương
    public static void main(String[] args) {
        int[] a = {1, -2, 3, 3, 4};
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                b += a[i];

            }

        }
        System.out.println("Tong cac so duong la : "+b);
    }
}
