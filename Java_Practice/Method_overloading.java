public class Method_overloading{
   static int fun(int n){
      final int m=10;
      return n;
   }
   static float fun(float n){
      return n;
   }
   static int fun(int n,int m){
      return n+m;
   }
   static void lokesh(){
      System.out.println("ganesh reddy");
   }
   public void ganesh(){
      System.out.println("LOKESH REDDY");
   }
   public static void main(String[] args){
      lokesh();
      Method_overloading ob=new Method_overloading();
   }
}