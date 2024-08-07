package org.javacore;

import java.util.Scanner;

public class Arrays {
       public static void main(String[] args) {
//        String[] Club =  {"Xe dap","Xe may"};
//        System.out.println(Club[0]);
//        Club[0] = "XE DAP DIEN";
//           System.out.println(Club[0]);

//           String[] a = new String[10];
//           a[0] = "a";
//           System.out.println(a[1]);
 //     String[] cars = {"Volvo","Merc","Ford","Mazda"};
//                   for(int i=0 ; i < cars.length;i++){
//                       System.out.println(cars[i]);
//
//                   }
//            int size;
//           Scanner scanner = new Scanner(System.in);
//           System.out.println("Nhap vao do dai cua mang");
//           size = scanner.nextInt();
//           int[] array = new int[size];
//           for (int i = 0; i < size; i++) {
//               System.out.println("Nhap vao phan tu thu " +i+ ":");
//               array[i] = scanner.nextInt(); // nhap gia tri cho phan tu
//           }
//           for (int i = 0; i < size; i++) {
//               System.out.println("Phan tu thu " + i + ":" + array[i]);
//           }
    // khia bao mang array 1 va array 2
//           int[] array1 = {2,10,3,9,8};
//           int[] array2 =  new int[5];
//           // gan gia tri cau phan tu thu 2 trong mang array1 cho pt thu 3 trong mang array2
//           array2[3] =  array1[2];
//           System.out.println("Gia tri cua phan tu thu 3 trong mang array2 la :  "+ array2[3] );
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
           } while (n <= 2 || n > max-1);

           System.out.println("Nhập giá trị cho các phần tử của mảng: ");
           for (int i = 0; i < n; i++) {
               System.out.print("A[" + i + "] = ");
               A[i] = scanner.nextInt();
           }

           // in ra màn hình mảng số ban đầu
           System.out.println("Mảng ban đầu: ");
           for (int i = 0; i < n; i++) {
               // in các phần tử trên cùng 1 dòng
               System.out.print(A[i] + "\t");
           }

           // sắp xếp các phần tử trong mảng
           // vòng lặp for sẽ duyệt i và j
           // i chạy từ 0 đến n - 2, j chay từ i + 1 đến n - 1
           // nếu phần tử tại chỉ số j nhỏ hơn phần tử tại i
           // thì sẽ hoán đổi vị trí 2 phần tử này cho nhau
           for (int i = 0; i < n - 1; i++) {
               for (int j = i+1; j <= n - 1; j++) {
                   if (A[j] < A[i]) {
                       temp = A[i];
                       A[i] = A[j];
                       A[j] = temp;
                   }
               }
           }

           // in ra màn hình mảng số sau khi sắp xếp
           System.out.println("\nMảng sau khi sắp xếp: ");
           for (int i = 0; i < n; i++) {
               System.out.print(A[i] + "\t");
           }

     }
}
