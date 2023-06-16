import java.util.*;
class Stringtest
  {
    public static void main(String[] args)
    {
      String s1="ABCABCABC";
      char[] c=s1.toCharArray();
      int k=3;
      for(int i=0;i<s1.length()-1;i++)
        {
          if(s1.substring(i,i+k)==s1.substring(i+k,i+k))
          {
            System.out.println("YES");
          }
          
        }
      
    }
  }