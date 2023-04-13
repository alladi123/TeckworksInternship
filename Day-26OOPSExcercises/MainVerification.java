/*Create an interface “Number” with the following abstract methods isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), and isAmstrong() the above methods return boolean primitive type. Implement this interface in the “Verification” class*/
import java.util.*;
interface Number
  {
    boolean isZero(int num);
    boolean isPositive(int num);
    boolean isNegative(int num);
    boolean isOdd(int num);
    boolean isEven(int num);
    boolean isArmstrong(int num);
    boolean isPrime(int num);
  }
 class Verification implements Number
  {
    public boolean isZero(int num)
    {
    if(num==0)
    {
      return true;
    }
      else
      {
        return false;
      }
      
    }
    
    public boolean isPositive(int num)
    {
      if(num>0)
      {
        return true;
      }
      else{
        return false;
      }
    }
    public boolean isOdd(int num)
    {
      if(num%2!=0)
      {
        return true;
      }
      else{
        return false;
      }
    }
    public boolean isEven(int num)
    {
      if(num%2==0)
      {
        return true;
      }
      else{
        return false;
      }
    }
    public boolean isNegative(int num)
    {
      if(num<0)
      {
        return true;
      }
      else{
        return false;
      }
    }
    public boolean isArmstrong(int num)
    {
     int s,r=0,t=num;
      while(num>0)
        {
          s=num%10;
          r=r+(s*s*s);
          num=num/10;
          }
      if(t==r)
      {
        return true;
      }
      else
      {
        return false;
      }
        
    }
    public  boolean isPrime(int num) 
     {
  for (int i = 2; i <num; i++) 
    {
       if (num % i == 0) {
        return false;
       }
    }
    return true;
    }
  }
 class MainVerification
  {
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    Verification v=new Verification();
   System.out.println(v.isZero(num));
    System.out.println(v.isPositive(num));
    System.out.println(v.isOdd(num));
    System.out.println(v.isEven(num));
    System.out.println(v.isArmstrong(num));
   System.out.println(v.isPrime(num));
  }
  }