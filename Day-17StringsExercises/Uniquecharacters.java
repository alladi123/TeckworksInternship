import java.util.*;
class Uniquecharacters
  {
    public static void unique(String str)
    {
     for(int i=0;i<=str.length();i++)
       {
         if(str.firstIndexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
         {
           System.out.println(str.charAt(i));
         }
       }
    }
public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=s.nextLine();
      unique(s1);
    }
  }