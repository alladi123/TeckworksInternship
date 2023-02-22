import java.util.*;
public class  Perfectnumber
  {
    public static void perfect(int number)
    {
      int i=1,sum=0,t=number;
      while(i<number)
        {
          if(number%i==0)
          {
            sum=sum+i;
          }
          i++;
        }
      if(sum==t){
            System.out.println(number+" "+"is a Perfect number");
          }
          else{
      System.out.println(number+" "+"is not a Perfect number");
          }
        
    }



     public static void main(String[] a)
    {
       Scanner s=new Scanner(System.in);
      System.out.print("enter the number:");
      int number=s.nextInt();
      perfect(number);
    }
  }