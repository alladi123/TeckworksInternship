import java.util.*;
class maxwordminword
  {
    public static void display(String str)
    {
      
      String a[]=str.split(" ");
      
      String minword=a[0];
        String maxword=a[0];
      for(int i=1;i<a.length-1;i++)
        {
          if(minword.length()>a[i].length())
          {
            minword=a[i];
          }
        if(maxword.length()<a[i].length())
        {
          maxword=a[i];
        }
      }
          System.out.println("minimum word is:"+minword);
      System.out.println("maximum word is:"+maxword);
    } 
public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=s.nextLine();
      display(s1);
    }
  } 