import java.util.*;
import java.util.Scanner;
public class test{
   private int x;
   @SuppressWarnings("unused")
   public void arrays(){
      int[] arr={1,2,3,4,5};
      //iteration
      arr[0]=3434;
      arr[2]=454;
      for(int i=0; i<arr.length; i++){
         System.out.println(arr[i]);
      }
      //iterator 
      int size_based_array[]= new int[14];
      for(int it: arr){
         System.out.println(it);
      }
      Map mpp=new HashMap();
      HashMap<Integer,Integer>mppp=new HashMap<>();
   }
   private void array_list(){
      ArrayList<Integer>arraylist=new ArrayList<>();
      arraylist.add(10);
      System.out.println(arraylist);
      for(int i=0; i<10; i++){
         arraylist.add(i);
      }
      arraylist.remove(0);
      arraylist.set(0,10);
      System.out.println(arraylist);
      for(int i=0; i<arraylist.size(); i++){
         System.out.print(arraylist.get(i)+" ");
      }
      Collections.sort(arraylist);
      System.out.println("");
      for(int i=0; i<arraylist.size(); i++){
         System.out.print(arraylist.get(i)+" ");
      }
   }
   protected void hashmap(){
      HashMap<Integer,Integer>mapp=new HashMap<>();
      int[] array={1,2,2,4,5,6,7};
      for (int i=0; i<array.length; i++){
         int value=mapp.getOrDefault(array[i],0)+1;
         mapp.put(array[i],value);
      }
      System.out.println(mapp);
      System.out.println(mapp.get(0));
      System.out.println(mapp.keySet());
      System.out.println(mapp.values());
   }
   public void hashset(){
      HashSet<String>sett=new HashSet<>();
      sett.add("lokesh reddy");
      sett.add("Hello World");
      Iterator <String> it=sett.iterator();
      while(it.hasNext()){
         System.out.println(it.next());
      }
      sett.remove("Hello World");
      sett.remove("Mahesh reddy");
      System.out.println(sett);

   }
   public void linkedlist(){
      LinkedList<Integer>linked=new LinkedList<>();
      linked.add(1);
      linked.add(1);
      linked.addFirst(2);
      linked.addLast(3);
      linked.add(3);
      System.out.println(linked);
      linked.peekLast();
      linked.peekFirst();
      linked.pollLast();
      System.out.println(linked);

   }
   public void string_methons(){
      
   }
   public void fundamentals(){
      //Fundamentals
      /*
       arrays
       arrays_list
       linked_list
       hashmap
       hashset
       for i in items:
       two types 
       1.primitice data 
       2.non primitive data
       1.int char float double shor byte String
       2.array,arraylist,hashing,set --linear data structure
       graphs tree it is a hirachical data structures;
       byte -128 t0 +127
       shot 
       int 10 9 
       final


       */
   }
   static void lokesh(){
      System.out.println("Hello world");
      //Data types
      final int x=100;
      String n="12";
      long m=Integer.parseInt(n);
      System.out.println(m);
      int dp[]=new int[12];
      Arrays.fill(dp,-1);
      
   }
   
   public static void main(String[] args){
      lokesh();
   }
}
