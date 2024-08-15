package org.Algorithm;

import org.javacore.Arrays;

public class Main {

//      int[] arr = {10,5,15,6,20};
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1]) {
                    // hoan doi arr[j]  arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // hoan doi arr nho nhat voi phan tu dau tien
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // di chuyen cac phan tu lon hon key den vi tri truoc do
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static int linearSearch(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1; // Không tìm thấy
    }


    public static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // kiem tra x = giua
            if (arr[m] == x) {
                return m;
            }

            // neu x lon hon bo nua trai
            if (arr[m] < x) {
                l = m + 1;
            }
            // x nho hon, bo nua phai
            else {
                r = m - 1;
            }
        }
        return -1; // khong tim thay
    }

    public static void main(String[] args) {
        int[] arr = {10,5,15,6,20};
        insertionSort(arr);
        for (int i : arr)
        {
            System.out.println(i);
        }
//        int x = 10;
//        int result = binarySearch(arr, x);
//        if (result == -1) {
//            System.out.println("Phần tử không có trong mảng");
//        } else {
//            System.out.println("Phần tử có ở vị trí: " + result);
//        }
    }
}
