/*Challenge-2
  Suppose you are working on a project that requires you to count the number of elements in an array that have a specific property, 
such as being an even number, odd number, prime number, and palindrome. You decide to create a program to automate this process.
Write a Java program to count the number of elements in an array that have a specific property. 
The program should prompt the user to enter the size of the array and then input the elements of the array dynamically. 
After inputting the array elements, the program should count the number of elements that have each specific property and display the results.
For example, if the user enters an array of size 5 with the elements {3, 2, 5, 7, 121}, 

the program should output:
Number of even elements: 1
Number of odd elements: 4
Number of prime elements: 4
Number of palindrome elements: 1*/
import java.util.*;
class Array
  {
    int size;
    int arr[];
    int even_count=0,odd_count=0,prime_count=0,palindrome_count=0;
    Scanner s=new Scanner(System.in);
    void addElements()
    {
      System.out.println("enter the size:");
      size=s.nextInt();
      arr=new int[size];
      for(int i=0;i<size;i++)
        {
          arr[i]=s.nextInt();
        }
    }
    void evenoddnumbers()
    {
      
      for(int j=0;j<size-1;j++)
        {
          if(arr[j]%2==0)
          {
            even_count++;
          }
          else
          {
            odd_count++;
          }
        }
      System.out.println(even_count);
       System.out.println(odd_count);
      }
    void palindromecount()
    {
       int sum=0,r;
      for(int i=0;i<=arr.length-1;i++)
        {
         int t=arr[i];
            while(t!=0)
              {
                r=t%10;
                sum=(sum*10)+r;
                t=t/10;
              }
            if(sum==t)
            {
              palindrome_count++;
            }
        }
      System.out.println(palindrome_count);
    }
    public static boolean primegenerator(int n) 
  {
  for (int i = 2; i <n; i++) 
    {
       if (n % i == 0) {
        return false;
       }
    }
    return true;
    }
    
    void primecount()
    {
      for(int i=0;i<=arr.length-1;i++)
        {
      if(primegenerator(arr[i]))
          {
            prime_count++;
          }
        }
      System.out.println(prime_count);
    }
      
      }
    class Challenge2
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      int testcases=s.nextInt();
      Array a[]=new Array[testcases];
      for(int i=0;i<testcases;i++)
        {
          a[i]=new Array();
          a[i].addElements();
          a[i].evenoddnumbers();
          a[i].palindromecount();
          a[i].primecount();
        }
    }
  }
