import java.util.*;
class PerfectNumber
  {
    public static void perfect(int num)
    {
      int sum=0,temp=num;
      for(int i=1;i<num;i++)
        {
          if(num%i==0)
          {
            sum=sum+i;
          }
        }
      if(sum==temp)
      {
        System.out.println(num+"is a perfect number");
      }
      else{
        System.out.println(num+"is not a perfect number");
      }
      System.out.println(temp);
    }
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number");
      int number=s.nextInt();
      perfect(number);
    }
  }