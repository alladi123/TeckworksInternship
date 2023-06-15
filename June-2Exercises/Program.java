import java.util.*;
class Program
  {
    public static void check(String str)
    {
      String s1[]=str.split(" ");
      for(int i=0;i<=s1.length-1;i++)
        {
          if(palindrome(s1[i]).equals(s1[i]))
          {
            System.out.println(s1[i]+"is a palindorme");
          }
        
        }
    }
    public static String palindrome(String str2)
    {
      String rev="";
      for(int i=str2.length()-1;i>=0;i--)
        {
          rev+=str2.charAt(i);
        }
      return rev;
    }
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      check(str);
    }
  }