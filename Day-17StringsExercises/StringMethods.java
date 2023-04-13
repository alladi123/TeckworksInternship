import java.util.*;
//String Methods
class StringMethods {
  
  public static void main(String[] ar) {
    Scanner s=new Scanner(System.in);
  String s1=new String(s.nextLine());
  String s2=new String(s.nextLine());
    
  /*System.out.println(s1==s2);
System.out.println(s1.startsWith("s"));
    System.out.println(s1.startsWith("ha"));
  System.out.println(s1.endsWith("hello"));
 System.out.println(s1.equalsIgnoreCase(s2));  */
   System.out.println(s1.indexOf("lll"));
     System.out.println(s1.lastIndexOf("z"));
   System.out.println(s1.indexOf("ex",1)); 
  System.out.println(s1.indexOf("l",4));
  System.out.println(s1.substring(2,3));
  System.out.println(s1.replace("ll","hi"));
  }
}