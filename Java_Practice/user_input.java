import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;
public class user_input{
   public HashMap<Integer,String> hash=new HashMap<>();
   user_input(int i,String value){
      hash.put(i,value);
   }
   public int read_integer()
   {
      hash.put(0,"Lokesh");
      Scanner obj=new Scanner(System.in);
      return obj.nextInt();
   }
   public String read_string(){
      Scanner st=new Scanner(System.in);
      return st.nextLine();
   }
   public boolean read_bool(){
      Scanner b=new Scanner(System.in);
      return b.nextBoolean();
   }
   public byte read_byte(){
      Scanner c=new Scanner(System.in);
      return c.nextByte();
   }
   public short read_short(){
      Scanner s=new Scanner(System.in);
      return s.nextShort();
   }
   public float read_float(){
      hash.put(1,"ganesh");
      hash.put(2,"nana");
      hash.put(3,"timer"); 
      System.out.println(hash);
      Scanner f=new Scanner(System.in);
      for(Integer i: hash.keySet()){
         System.out.println(i);
      }
      return f.nextFloat();
   }
   public double read_double(){
      Scanner d=new Scanner(System.in);
      return d.nextDouble();
   }
   public long read_long(){
      Scanner l=new Scanner(System.in);
      return l.nextLong();
   }
   public static void main(String[] args){
      user_input res=new user_input(0,"lokesh reddy");
      System.out.println(res.read_float());
   }
}