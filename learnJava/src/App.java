import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class App {
    public static void main(String[] args) throws Exception {
      ArrayList<Integer> lst = new ArrayList<>();
      // khai bao voi so luong phan tu ban dau 
      ArrayList<Integer> lst2 = new ArrayList<>(5);
      // khoi tao list voi nhung phan tu san co 
      ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
      lst3.add(1,20);
      System.out.println(lst3);
      System.out.println(lst3.size());
      System.out.println(lst3.get(2));
      lst3.remove(Integer.valueOf(9));
      System.out.println(lst3);
      Collections.sort(lst3);
      System.out.println(lst3);
      ArrayList<Integer> lst4 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
      // duyet list
      System.out.println("vong for");
      for(int i : lst4 ){
        System.out.println(i);
      }
      System.out.println("---------------------------------");
      // neu can lam viec voi vi tri index can phai su dung cach nay 
      for(int j = 0 ; j < lst4.size(); j ++){
        int i = lst4.get(j);
        System.out.println(i);
      }


    } 
}
