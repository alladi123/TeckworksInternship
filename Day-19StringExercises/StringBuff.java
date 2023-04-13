
import java.util.*;
class StringBuff
  {
    public static void display(String str)
    {
      StringBuffer sb=new StringBuffer(str);
    // String a=sb.append("hello");
      //System.out.println(a);
      System.out.println(sb.delete(1,5));
      System.out.println(sb.insert(2,"hi"));
      System.out.println(sb.reverse());
      System.out.println(sb.replace(3,7,"hello"));
      System.out.println(sb.append("hello"));
      System.out.println(sb.length());
      //System.out.println(sb.deleteCharAt(5));
    }
  public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=new String(s.nextLine());
      display(s1);
    }
  } 