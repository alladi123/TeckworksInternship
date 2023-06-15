import java.util.*;
class ReverseWord
  {
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      reverse(str);
    }
    public static void reverse(String str)
    {
      String s1[]=str.split(" ");
      for(int i=0;i<=s1.length-1;i++)
        {
          if(i==s1.length-1)
          {
            reverseword(s1[i]);
          }
        }
    }
    public static void reverseword(String s1)
    {
      String rev="";
      for(int i=s1.length()-1;i>=0;i--)
        {
          rev+=s1.charAt(i);
        }
      System.out.println(rev);
    }
  }