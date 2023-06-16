import java.util.*;
class Section2Program5
  {
    public static void display(String str)
    {
      String a="";
      String b="";
      for(int i=0;i<=str.length()-1;i++)
        {
          if(i%2==0)
          {
            a+=str.charAt(i);
          }
          else{
            b+=str.charAt(i);
          }
        }
      System.out.println(a+b);
    }


 public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      String string=s.next();
      display(string);
    }
  }