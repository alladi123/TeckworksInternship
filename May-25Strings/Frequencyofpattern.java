import java.util.*;
class Frequencyofpattern
  {
    public static void  countpattern(String str,String pattern)
    {
      String s1[]=str.split(" ");
      int freq=0;
      for(int i=0;i<=s1.length-1;i++)
        {
          if(s1[i].equals(pattern))
          {
            freq++;
          }
          }
        
      
      System.out.println(freq);
    }
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String pattern=s.nextLine();
      countpattern(str,pattern);
    }
  }