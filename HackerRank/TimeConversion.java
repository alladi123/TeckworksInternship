import java.util.*;
class TimeConversion 
{
  public static void display(String str)
  {
   
    String s2=str.substring(0,2);
    int n=Integer.parseInt(s2);
    
    int num=12+n;
    String s3=String.valueOf(num);
    String str2=str.replace(s2,s3);
    String str3=str2.replace(str2.substring(8,10),"");
    System.out.println(str3);
  }
public static void main(String[] r) 
  {
    Scanner s = new Scanner(System.in);
    String str=s.nextLine();
   
   display(str);
 }
}

      

  