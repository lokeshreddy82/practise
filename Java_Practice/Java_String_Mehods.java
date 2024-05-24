import java.util.*;
@SuppressWarnings("unused")
public class Java_String_Mehods {
   //public static void solution(){
      //String Methods;
      /* 
      String s="Madanapalli Institue of Technology and Science";
      System.out.println("index finding "+s.charAt(0));//return char
      System.out.println("returns the unicode of the character "+s.codePointAt(10)); //return ascii value for that char
      int n=s.length();
      System.out.println("size "+n+" "+s.codePointBefore(n));//waste function
      System.out.println("size "+n+" "+s.codePointCount(0,5));
      String s1="lokesh reddy";
      System.out.println(s1==s);
      System.out.println(s1.compareTo(s));
      System.out.println(s1.contains("reddy"));//It checks weather this element is in or not
      System.out.println(s1.contentEquals("lokesh reddy"));
      char[] mystr={'l','o','k','e','s','h'};
      String mystr2="";
      mystr2=String.copyValueOf(mystr,0,mystr.length);//it is used to convert the char array to Strin
      //mystr2=mystr2.copyValueOf(mystr,0,mystr.length);
      System.out.println(mystr2);
      //endsWith() this function is helpfull to check the string ends with it is not;
      //startsWith() this Method is helpfull to check the string starts with given substrin or not;
      System.out.println(s1.startsWith("lokesh"));//it is help full for finding the starts with or not 
      System.out.println(s1.indexOf("lok"));//it return index for that string 
      System.out.println(s1.toUpperCase());//it is used to change to upper case 
      System.out.println(s1.toLowerCase());//it is used to change to lower case
      char[] arrays={'a','b','c','d'};
      System.out.println(String.valueOf(arrays));
      String ss="    lokeshlokesh   ";
      String print=ss.strip();
      Integer size=print.length();
      System.out.println(size);
      System.out.println(print.substring(0,size));
      System.out.println(print.subSequence(0, size));

   }*/
   static void start(){
      char[] res={'a','b','c','d'};
      //charAT
      String ans="Lokesh Reddy";
      System.out.println(ans.charAt(4));
      System.out.println(String.valueOf(res));
      System.out.println(ans.toUpperCase());
      System.out.println(ans.toLowerCase());
      System.out.println(ans.substring(0,5));
      System.out.println(ans.subSequence(0,4));
      String itis=" Hello WORLD ";
      System.out.println(itis.strip());
      System.out.println(itis.trim());
      System.out.println(ans.codePointAt(0));
      System.out.println(ans.toString());
      System.out.println(ans.length());
      System.out.println(ans.startsWith("Lokesh"));
      System.out.println(ans.endsWith("D"));
      System.out.println(ans.isEmpty());
      String akhil=String.join(" *","lokesh", "reddy");
      System.out.println(akhil);
      String matter="Hello World Hello";
      System.out.println(matter.lastIndexOf("Hello"));
      System.out.println();
      char[] arraysss="lokesh reddy".toCharArray();
      int size=arraysss.length;
      System.out.println(size);
   }
   public static void main(String[] args){
      start();
   }
}
