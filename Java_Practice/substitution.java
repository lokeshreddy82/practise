import java.util.*;
class substitution{
     public static void sub(String plaintext,int key){
          int space=32;
          int size=plaintext.length();
          String encrypt="";
          int small_start=97;
          int small_end=122;
          int captal_start=67;
          int captal_end=90;
          for(int i=0; i<plaintext.length(); i++){
               int value= (int) plaintext.charAt(i);
               int doing=0;
               int extra=0;
               if (value==32){
                    encrypt +=" ";
               }
               else{
                    if (value+key<=small_end){
                         doing=value+key;
                         if (doing>small_end){
                              extra=doing-small_end;
                              encrypt +=(char) (small_start+extra);
                         }
                         else{
                              encrypt += (char) (doing);
                         }
                    }
                    else{
                         doing=value+key;
                         if (doing>captal_end){
                              extra=doing-captal_end;
                              encrypt +=(char) (captal_start+extra);
                         }
                         else{
                              encrypt +=(char) (doing);
                         }

                    }
               }
          }
          System.out.println(encrypt);
     }
     public static void main(String[] args){
          Scanner input=new Scanner(System.in);
          String text=input.nextLine();
          int key=input.nextInt();
          char c=(char)(65);
          sub(text,key);
     }
}