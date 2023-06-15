import java.util.*;
class CompareTwoStrings
  {
    public static void compare(String str1,String str2)
    {
       int c=0;
      if(s1.length()==s2.length())
      {
      for(int i=0;i<=s1.length()-1;i++)
        {
          if(s1.charAt(i)==s2.charAt(i))
          {
            c++;
          }
        }
      }
      if(c==s1.length())
      {
      System.out.println("equal");
      }
      else{
        System.out.println("not equal");
      }
    }
    public static void main(String[] t)
    {
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      String s2=s.nextLine();
      compare(s1,s2);
    }
  }