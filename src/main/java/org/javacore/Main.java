package org.javacore;


import java.util.Scanner;

// method = function = phuong thuc = ham

public class Main {
    public static void main(String[] args) {
        System.out.printf("Nhập số lượng phần tử arr: ");
        Scanner sc = new Scanner(System.in);

        int sizeArray = sc.nextInt();
//
       Integer[] arr= nhapMang(sizeArray,sc);
//
        System.out.println("xuat mang lan 1");
       xuatMang(arr);

        System.out.println("sap xep mang");
       revertArray(arr);
        System.out.println("mang da sap xep");
       xuatMang(arr);

//        int number = sc.nextInt();
//
//        System.out.println(revertNumber(number));
//        timMinMax();



//        int [][] matrix ={
//                {1,2,3},
//                {3,4,5}
//        };
//        System.out.println("length matrix:" + matrix.length);
//        for (int i = 0; i<matrix.length ; i++ )
//        {
//            for (int j =0 ; j< matrix[i].length; j++)
//            {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }


    public static Integer[] revertArray(Integer[] arr)
    {

      int left = 0 ;
      int right = arr.length - 1;
       while (left < right)
       {
           int temp = arr[left]; // 1
           arr[left] = arr[right];
           arr[right] = temp;
           left++;
           right--;
       }
       return arr;
    }


    // Class Scanner là đối tượng dùng để tương tác nhận input từ bàn phím.
    public static Integer[] nhapMang(int size,Scanner sc)// scanner tham số
    {
       Integer[] arr = new Integer[size];
       for( int i = 0 ; i < size ; i++)
       {
           System.out.println("nhap phan tu "+i + " : ");
           arr[i] = sc.nextInt();
       }
       return arr;
    }

    public static void xuatMang(Integer[] arr)
    {
        for (int i =0 ; i< arr.length ; i++)
        {
            System.out.println("index - "+ i + " :"+arr[i]);
        }
    }

    public static Integer revertNumber(int number)
    {
        // doi so
        int reverdNumber = 0;
        while (number!= 0)
        {
            int digit = number % 10;
            reverdNumber = reverdNumber * 10 + digit;
            number = number / 10;
        }
        return reverdNumber;
    }

    public static  void timMinMax()
    {
        Scanner sc = new Scanner(System.in);
        int number ;
        int max  = 0 ;
        int min = 0;
        char choice;
        do {
            System.out.println("Nhap so : ");
            number = sc.nextInt();
            if(max == 0 && min == 0)
            {
                max = number;
                min = number;
            }
            if(number  > max)
            {
                max = number;
            }
            if(number < min)
                min = number;

            System.out.println("Ban co muon nhap tiep khong Y/N ");
            choice = sc.next().charAt(0);
//            sc.nextLine();Nguyen Chi thanh
//            sc.next(); Nguyen chi thanh
        }while(choice == 'Y');
        System.out.println("So lon nhat: "+max);
        System.out.println("So nho nhat: "+min);
    }
}
