/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 24 ..... */
import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        
        int number;
         int first= 0,second= 1,third;
 
        System.out.print("Enter number of terms of series:");
        number=s.nextInt();
 
        System.out.print(first+ " "+ second+ " ");
 
        for(int i = 3;i<=number; i++)
	       {
            thirdTerm = first+second;
            System.out.print(third+ " ");
            first=second;
            second=third;
	       }
    }  
}