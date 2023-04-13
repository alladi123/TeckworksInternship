/*create a class EvenArray having  add() and testEven() methods to take input and verify whether each array element is even or not, if the element is not an even number generate a custom exception, Test your code for any 4 different cases. Use an array of objects for the test cases. */
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
    
    for(int i=0;i<=size-1;i++)
      {
        arr[i]=s.nextInt();
      }
       
    }
    void eventest()
    {
      for(int i=0;i<=size-1;i++)
        {
          if(arr[i]%2!=0)
             {
          throw new invalidnumber("errors:invalid numbers");
        }
        else
        {
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
}
  class ArrayExample
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
  


