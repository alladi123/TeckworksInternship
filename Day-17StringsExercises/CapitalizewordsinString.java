import java.util.*;
class CapitalizewordsinString
  {
    public static void display(String str)
    {
    char c[]=str.toUpperCase().toCharArray();
      System.out.println(c);
    }
public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=s.nextLine();
      display(s1);
    }
  }  