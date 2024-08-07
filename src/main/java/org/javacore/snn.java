
public class snn {
    public static void main(String[] args) throws Exception {
      // Viet ham tim so nho nhat trong mang
       int[]  a = {11,22,23,34,45,7};
       int soNn = findMax(a);
    
       System.out.println("gia tri lon nhat trong mang la : " + soNn);

    }
    public static int findMax(int[] array){
        if (array == null || array.length == 0 ) {
            System.out.println("Mang khong duoc rong");
            
        }
        int soNn = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < soNn) {
                soNn = array[i];
                
            }
            
        }
        return soNn;
    }
    }

