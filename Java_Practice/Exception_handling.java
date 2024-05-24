import java.util.*;
public class Exception_handling {
   public static void handling(){
      try{
         int[] numbers={1,2,3};
         System.out.println(numbers[10]);
      }
      catch (Exception e){
         System.out.println("Exception handling Succesfully");
      }
      finally{
         System.out.println("Executed Succesfully");
      }
   }
   public static void main(String[] args){
      handling();
   }
}
