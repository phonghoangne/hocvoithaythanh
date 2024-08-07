import java.util.Scanner;

public class btGopmang {
public static void main(String[] args) {

 int n, m;
           Scanner scanner = new Scanner(System.in);

           // khai báo và cấp phát bộ nhớ cho mảng A
           int A[] = new int[100];
           int B[] =  new int[100];


           // nhập số phần tử của mảng
               System.out.println("nhap so phan tu cua mang ");
               n = scanner.nextInt();
           System.out.println("gia tri cac phan tu mang: ");
           for (int i = 0; i < n; i++) {
               System.out.print("A[" + i + "] = ");
               A[i] = scanner.nextInt();
           }
            System.out.println("nhap so phan tu cua mang ");
            m= scanner.nextInt();
        System.out.println("gia tri cac phan tu mang: ");
        for (int i = 0; i < m; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = scanner.nextInt();
        }
        int[] mergedArray = mergeArrays(A, n, B, m);

        // In kết quả gộp
        System.out.println("Mảng gộp:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }

    public static int[] mergeArrays(int[] array1, int size1, int[] array2, int size2) {
        // Tạo mảng mới với kích thước bằng tổng kích thước của hai mảng
        int[] result = new int[size1 + size2];
        
        // Sao chép phần tử từ mảng đầu tiên vào mảng kết quả
        for (int i = 0; i < size1; i++) {
            result[i] = array1[i];
        }
        
        // Sao chép phần tử từ mảng thứ hai vào mảng kết quả
        for (int i = 0; i < size2; i++) {
            result[size1 + i] = array2[i];
        }
        
        return result;
    }

}
    
