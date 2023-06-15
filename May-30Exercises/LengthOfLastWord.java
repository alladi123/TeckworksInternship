import java.util.*;
class LengthOfLastWord
  {
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      lastwordlength(str);
    }
    public static void lastwordlength(String str)
    {
      String s1[]=str.split(" ");
      int len=0;
      for(int i=0;i<=s1.length-1;i++)
        {
          if(i==s1.length-1)
          {
           len=s1[i].length();
          }
        }
      System.out.println("length of last word is:"+len);
    }
  }