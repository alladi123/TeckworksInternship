import java.util.*;
public class  PrimeGenerator
{
   public static void nextPrime(int num)
    {
        for (int i=2; i < num; i++) 
        {
            for (int j = 3; j<=i/2; j+=2)
            {
                if (num % i == 0)
                {
                    break;
                }
            }
         
        }
 System.out.println(num);
   // return num;
    }
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int number=s.nextInt();
    nextPrime(number);
  }
}

  

   
