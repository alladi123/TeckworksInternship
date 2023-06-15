import java.util.*;
class ReversingString
  {
    public static String reverse(String str)
    {
      char c[]=str.toCharArray();
      int i=0,j=str.length()-1;
      while(i<j)
        {
          char t=c[i];
          c[i]=c[j];
          c[j]=t;
          i++;
          j--;
        }
      String str1=new String(c);
      return str1;
    }
    public static void main(String[] t)
    {
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
       String s2= reverse(s1);
     System.out.println(s2);
    }
  }