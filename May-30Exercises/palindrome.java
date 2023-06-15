import java.util.*;
class palindrome
  {
    public static int palindromenum(int n)
    {
      int sum=0;
      while(n!=0)
        {
         int r=n%10;
         sum=(sum*10)+r;
          n=n/10;
        }
      return sum;
    }
   public static boolean reverse(int n)
    {
      return (palindrome(n)==n);
    }
    public static void method(int n)
    {
      int r=0;
      while(n<=426657){
        
      
      r=palindrome(n);
      n=n+r;
        if(reverse(n))
        {
          System.out.println(n);
          break;
        }
      }
    }
    public static void main(String[] rr)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
     palindromenum(n); 
    }
  }