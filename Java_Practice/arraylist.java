import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;
public class arraylist {
   public static void main(String[] args){
      ArrayList<Integer>cars=new ArrayList<Integer>();
      cars.add(1);
      System.out.println(cars);
      /* System.out.println(cars.get(0));
      cars.set(3,"Mahesh");
      System.out.println(cars);
      cars.remove(0);*/
      cars.add(2);
      cars.add(3);
      cars.add(4);
      cars.add(5);
      cars.add(0);
      Collections.sort(cars);
      int length=cars.size();
      System.out.println(cars);
   }
}
//addFirst();
//addLast();
//removeFirst();
//removeLast();
//getFirst();
//getLast();