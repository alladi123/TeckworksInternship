import java.util.*;
class FindindexofPattern
  {
    public static void display(String str)
    {
       Scanner s=new Scanner(System.in);
  System.out.println("enter the pattern you have to search");
      String pattern=new String(s.nextLine());
      System.out.println(str.indexOf(pattern));
    }
public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=s.nextLine();
      display(s1);
    }
  }  