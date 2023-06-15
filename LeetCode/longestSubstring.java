import java.util.*;
class longestSubstring
  {
    public static void check(String str)
    {
      int j=0,c=0;
      for(int i=0;i<=str.length()-1;i++)
        {
          if(str.charAt(i)!=str.charAt(i+1))
          {
            c++;
          }
        }
    }
    public static void main(String r[])
    {
      //Scanner s=new Scanner(System.in);
      String s1="abcabcbb";
      check(s1);
    }
  }