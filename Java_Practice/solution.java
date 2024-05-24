interface demo{
   int x=10;
   void presentation(int x ,int y);
   void dressing_style();
} 
class interfaces_test implements demo
{
   public void presentation(int x,int y){
      System.out.println("Hello");
   }
   public void dressing_style(){
      System.out.println("world");
   }
}
public class solution{
   public static void main(String[] args){
      interfaces_test obj=new interfaces_test();
      obj.presentation(4,5);
      obj.dressing_style();
   }
}