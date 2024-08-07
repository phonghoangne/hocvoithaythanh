package org.javacore;

import java.util.Scanner;

public class BtSwitchCase {
    public static void main(String[] args) {
        //Viết chương trình chọn menu có chức năng từ 1 -> 5 in ra màn hình số chức năng tương ứng ( sử dụng switch case )
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay Chon menu ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Com Trang");
                break;
            case 2:
                System.out.println("Com Ca");
                break;
            case 3:
                System.out.println("Com Thit Nuong");
                break;
            case 4:
                System.out.println("Com Nieu");
                break;
            default:
                System.out.println("Canh chua ca loc ");
        }

    }
}
