/*create a class ArraySequence having  add() and sequence() to give data and arrange all –ve numbers in descending order, if any array element is 0 or +ve then generate a custom exception. Test your code for any 6 different scenarios. Use an array of objects for the test cases.*/
import java.util.*;
class  invalidnumber extends Exception
  {
    invalidnumber(String message)
    {
      super(message);
    }
  }
class Array
  {
    Scanner s=new Scanner(System.in);
    int size;
    int arr[];
    void add()
    {
    System.out.println("enter the size:");
    size=s.nextInt();
    arr=new int[size];
      System.out.println("enter the elemnts:");
     try
      { 
    for(int i=0;i<=size-1;i++)
      {
        arr[i]=s.nextInt();
        if(arr[i]>=0)
        {
          throw new invalidnumber("errors:invalid numbers");
        }
        else{
          System.out.println("it is a positive or zero");
          return;
        }
      }
      }
        catch(invalidnumber in)
       {
         System.out.println(in);
       }
    }
    void check()
    {
      for (int i = 0; i < size - 1; i++) 
      {
        for (int j = i + 1; j < size; j++) 
        {
          if (arr[i] < arr[j]) 
          {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
      }
      for(int k=0;k<=size-1;k++)
           {
             System.out.println(arr[k]);
           }
    }
    
  }
class ArraySequence
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the testcases:");
      int testcases=s.nextInt();
       Array ob[]=new Array[testcases];
      for(int i=0;i<=testcases;i++)
        {
         ob[i]=new  Array();
          ob[i].add();
          ob[i].check();
          
        }
    }
  }
