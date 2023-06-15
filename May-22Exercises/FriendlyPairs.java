import java.util.*;
public class FriendlyPairs
 {
   public  static int Divisor(int num)
   {

     int sum = 0;

     for (int i = 1; i < num; i++)
       {
 	    if (num % i == 0)
 	    sum = sum + i;
       }
     return sum;
   }
   public static void main (String[]args)
   {
    Scanner s=new Scanner(System.in);
     int num1=s.nextInt();
     int num2=s.nextInt();
     int sum1 =Divisor(num1);
     int sum2 =Divisor(num2);

     if (sum1 / num1 == sum2 / num2)
       System.out.println (num1+","+ num2 + "are friendly pairs");
     else
         System.out.println (num1+ ","+num2 + " are not friendly pairs");
   }

  
 }