
public class sln {
    public static void main(String[] args) throws Exception {
      // Viet ham tim so lon nhat trong mang
       int[]  numbers = {1,2,3,4,5,7};
       int soLn = findMax(numbers);
    
       System.out.println("gia tri lon nhat trong mang la : " + soLn);

    }
    public static int findMax(int[] array){
        if (array == null || array.length == 0 ) {
            System.out.println("Mang khong duoc rong");
            
        }
        int soLn = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > soLn) {
                soLn = array[i];
                
            }
            
        }
        return soLn;
    }
    }

