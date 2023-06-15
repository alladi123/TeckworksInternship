import java.util.*;
class Palindrome {
    public static  boolean isPalindrome(int x) 
    {
        int t=x, sum=0;
        while(x!=0)
        {
        int r=x%10;
        sum=sum*10+r;
         x=x/10;
        }
        if(sum==t)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        isPalindrome(x);
    }
        
    
}