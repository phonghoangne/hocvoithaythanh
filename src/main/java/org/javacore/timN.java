package org.javacore;

import java.util.Scanner;

public class timN {
    public static void main(String[] args) {
        //Viết hàm có tham số truyền vào 1 mảng và 1 số n, tìm số n có trong mảng hay không
        // nếu có xuất ra màn hình không có thì xuất thông báo
        int n, temp, max = 100;
        Scanner scanner = new Scanner(System.in);

        // khai báo và cấp phát bộ nhớ cho mảng A
        int A[] = new int[max];

        // nhập số phần tử của mảng
        // kiểm tra nếu n <= 2 hoặc n > max - 1
        // thì phải nhập lại
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 2 || n > max - 1);

        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // in ra màn mảng
        System.out.println("Mảng : ");
        for (int i = 0; i < n; i++) {
            // in các phần tử trên cùng 1 dòng
            System.out.print(A[i] + "\t");
        }
    }}
