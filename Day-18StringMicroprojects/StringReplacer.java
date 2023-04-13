import java.util.*;
class StringReplacer
  {
public static String ReplaceWord(String s1,String s2,String s3)
    {
       String str1[]=s1.split(" ");
      for(int i=0;i<str1.length;i++)
        {
         if(str1[i].equals(s2))
         {
           str1[i]=s3;
         }
      }
       return String.join(" ", str1); 
     }

public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=new String(s.nextLine());
  System.out.println("enter the word for occurrence:");
       String s2= new String(s.nextLine()); 
      System.out.println("enter the word to replace:");
      String s3=new String(s.nextLine());
      String replacing=ReplaceWord(s1,s2,s3);
      System.out.println(replacing);

    }
  }  