import java.util.*;
class ConcatinateStrings
  {
    public static void main(String[] t)
    {
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      String s2=s.nextLine();
      String s3="";
      for(int i=0;i<=s1.length()-1;i++)
        {
          s3+=s1.charAt(i);
        }
for(int i=0;i<=s2.length()-1;i++)
        {
          s3+=s2.charAt(i);
        }
      System.out.println(s3);
    }
  }