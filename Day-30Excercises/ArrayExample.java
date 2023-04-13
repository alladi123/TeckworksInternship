/*Create class ArrayExample having read() and sum() to read data and add array elements in case the array element is +ve, if not generate a custom exception. Test your application for any 5 different scenarios. Use an array of objects for the test cases.*/
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
        if(arr[i]<0)
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
    void sum()
    {
      int sum1=0;
      for(int i=0;i<=size-1;i++)
        {
          sum1+=arr[i];
        }
      System.out.println(sum1);
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
  