import java.util.Scanner;
//Addition of two numbers without using '+' operator
class Addition
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       int a=s.nextInt();
      int b=s.nextInt();
      if(a<b)
      {
      for(int i=a;i>0;i--)
        {
          b+=1;
        }
        System.out.println(b);
      }
      else{
        for(int j=b;j>0;j--)
          {
            a+=1;
          }
        System.out.println(a);
        
      }
    }
  }