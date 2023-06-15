import java.util.*;
class PrimeFactors
  {
    public static boolean prime(int num)
    {
      for(int j=2;j<num;j++)
        {
          if(num%j==0)
          {
            return false;
          }
        }
    return true;
    }
    public static void factors(int number)
    {
      for(int i=2;i<number;i++)
        {
          if(number%i==0)
          {
            if(prime(i))
            {
              System.out.println("prime factors are:"+i);
            }
          }
        }
    }
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      int number=s.nextInt();
      factors(number);
    }
  }