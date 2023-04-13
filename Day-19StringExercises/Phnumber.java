import java.util.*;
class Phnumber
  {
    public static void display(String s1)
    {
      int count=0;
      for(int i=0;i<=s1.length()-1;i++)
        {
          if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
          {
            count++;
          }
        }
      if(count==10)
      {
        System.out.println("it is a valid number:");
      }
      else{
        System.out.println("it is not a valid number");
      }
    }
  
public static void main(String[] ar)
  {
  Scanner s=new Scanner(System.in);
  System.out.println("enter the string");
  String str=new String(s.nextLine());
   display(str);
  }
}