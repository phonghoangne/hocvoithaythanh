package org.javacore;


import java.util.Scanner;

public class BaiTap {
    public void bangCuuChuong()
    {
        for(int i=2;i<=9;i++){
            System.out.println();
            for(int j=1;j<=9;j++){
                System.out.println(i*j);
            }
        }
    }

    public void bangCuuChuong2()
    {
        int[][] multiplicationTable = new int[9][2];

        for (int i = 0; i < 9; i++) {
            multiplicationTable[i][0] = 2;
            multiplicationTable[i][1] = i + 1;
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(multiplicationTable[i][0] + " x " + multiplicationTable[i][1] + " = " + (multiplicationTable[i][0] * multiplicationTable[i][1]));
        }
    }

    public static int phanTuNhoThu2(int[] a, int len){
        int t;
        for (int i = 0; i < len; i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                if (a[i] > a[j])
                {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a[1];
    }

    public static int[] xoaPhantu(int a[])
    {
        int n = a.length;
        if (n == 0 || n == 1)
        {
            return a;
        }
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++)
        {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];


       return temp;

    }


    public  void timSoNtrongMang(int[] array, int n) {
        boolean found = false;
        for (int i : array) {
            if (i == n) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Số " + n + " có trong mảng.");
        } else {
            System.out.println("Số " + n + " không có trong mảng.");
        }
    }

    public  void gopMang()
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the First Array Limit :");
        int n =input.nextInt();
        System.out.print("Enter the Second Array Limit :");
        int m =input.nextInt();
        int [] a =new int[n];
        int [] b =new int[m];
        int [] c =new int[100];
        int k=0;
        for(int i=0;i<n;i++)
        {
            System.out.printf("Element of a[%d] :",i);
            a[i]=input.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            System.out.printf("Element of b[%d] :",i);
            b[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c[k] = a[i];
            k++;
        }
        for(int i=0;i<m;i++)
        {
            c[k] = b[i];
            k++;
        }
        System.out.print("\nMerge two Array Elements ...\n");
        for(int i=0;i<k;i++)
        {
            System.out.printf("\nc[%d] = %d",i,c[i]);
        }
    }

    public void soLonNhatsoNhoNhat(int [] a){

        int max=0,min=0;
//        for(int i=0;i<l;i++)
//        {
//            System.out.printf("Element of a[%d] :",i);
//            a[i]=input.nextInt();
//        }
        max=a[0];
        min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
                max=a[i];
            if(min>a[i])
                min=a[i];
        }
        System.out.println("Maximum Element of Array : "+max);
        System.out.println("Minimum Element of Array : "+min);
    }

    public void bac3( int l, Scanner input)
    {
        int [] a =new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.printf("Element of a[%d] :",i);
            a[i]=input.nextInt();
        }
        System.out.println("\nCubic Array Elements...\n");
        // for each
        for(int e:a)
        {
            System.out.println(e*e*e);
        }
    }

    public  void tinhTongDuong(Scanner input)
    {
        System.out.print("Enter the Array Limit :");
        int l =input.nextInt();
        int [] a =new int[l];
        int sum = 0;
        for(int i=0;i<l;i++)
        {
            System.out.printf("Element of a[%d] :",i);
            a[i]=input.nextInt();
            if(a[i] < 0){
                System.out.println("khong duoc nhap so am");
                break;
            }
        }
        for(int p:a)
        {
            if(p>0)
                sum = sum + p;

        }
        System.out.println("Sum of Positive Array Elements : "+sum);
    }


}
