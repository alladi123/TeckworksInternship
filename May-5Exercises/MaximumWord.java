import java.util.*;
class MaximumWord
  {
    public static void maxword(String str)
    {
      String s1[]=str.split(" ");
     // String maxcount="";
      int count=s1[0].length();
      for(int i=0;i<=s1.length-1;i++)
        {
     // for(int j=0;j<=s1.length;j++)
        
          if(s1[i].length()>=count)
          {
            count=s1[i].length();
          }
        }
      System.out.println("largest word is :"+count);
    }
  
public static void main(String[] a)
  {
  Scanner s=new Scanner(System.in);
  String str=s.next();
  maxword(str);
  }
}