import java.util.*;
public class AnagramString
  {
    public static String sorting(String str)
    {
      char c1[]=str.toCharArray();
      for(int i=0;i<=c1.length-1;i++)
        {
          for(int j=i+1;j<=c1.length-1;j++)
            {
              if(c1[i]>c1[j])
              {
              char t=c1[i];
              c1[i]=c1[j];
              c1[j]=t;
              }
          }
        }
      String st1=new String(c1);
      return st1;
    }
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      String str2=s.nextLine();
      String s1=sorting(str1);
    String s2=sorting(str2);
      if(s1.equals(s2))
      {
        System.out.println("two strings are anagrams");
      }
      else
      {
        System.out.println("two strings are not anagrams");
      }
    }
  }