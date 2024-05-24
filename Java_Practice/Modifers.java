public class Modifers {
   int x;
   Modifers(int y){
      x=y;
   }
   public static void main(String args[]){
      Modifers obj=new Modifers(10);
      obj.x=20;
      System.out.println(obj.x);
   }
}
