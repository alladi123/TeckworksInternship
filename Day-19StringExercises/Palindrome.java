import java.util.*;
class  Palindrome
  {
    public static void display(String string)
    {
      String s1[]=string.split(" ");
     for(int i=0;i<s1.length-1;i++)
       {
         boolean f=Palindrome(s1[i]);
         if(f==true)
         
          // s1[i]="palindrome";
        s1[i].replace(s1[i],"palindrome");   
        }
     String res="";
      for(int i=0;i<=s1.length-1;i++)
        {
          res=res+" "+s1[i];
        }
    System.out.println(res);
        
    }
    public static void Palindrome(String s2)
    {
       String str="";
      for(int i=s2.length()-1;i>=0;i--)
        {
          str=str+s2.charAt(i);
        }
       if(str==s2)
         return true;
    
  }
  public static void main(String[] ar)
  {
  Scanner s=new Scanner(System.in);
     System.out.println("enter the string");
  String str=new String(s.nextLine());
   display(str);
  }
}   