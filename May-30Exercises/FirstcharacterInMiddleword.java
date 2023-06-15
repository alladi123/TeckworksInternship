import java.util.*;
class FirstcharacterInMiddleword
  {
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      firstcharinmiddle(str);
    }
    public static void firstcharinmiddle(String str)
    {
      String s1[]=str.split(" ");
      int middle=s1.length/2;
      char c=' ';
      for(int i=0;i<=s1.length-1;i++)
        {
          if(middle==i)
          {
           c=s1[i].charAt(0);
          }
        }
      System.out.println("middle word first character:"+c);
    }
  }