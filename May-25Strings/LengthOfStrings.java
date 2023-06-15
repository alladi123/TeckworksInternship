import java.util.*;
class LengthOfStrings
  {
    public static void main(String[] t)
    {
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      int c=0;
      for(int i=0;i<=s1.length()-1;i++)
        {
          if(s1.charAt(i)!=' ')
          {
            c++;
          }
        }
      System.out.println(c);
    }
  }