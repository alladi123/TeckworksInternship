import java.util.*;
class  SumofDigits
  {
    public static void Sum(String l)
    {
   // String s=Long.toString(l);
      int sum=0;
for(int i=0;i<=l.length()-1;i+=3)
        {
        int a=l.charAt(i);
      sum+= Character.getNumericValue(l.charAt(i));; 
          }
       
      System.out.println(sum);
  }
 public static void main(String[] r)
    {
Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
     String number=s.next();
    Sum(number);
    }
}