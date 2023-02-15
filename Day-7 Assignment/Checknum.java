import java.util.Scanner;
// check given number is positive or negative or zero
class Checknum {
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       int a=s.nextInt();
      
      if(a>0){
        System.out.println(a+"is positive number");
      }
      else if(a==0)
        {
         System.out.println(a+"is a zero");
      }
      else{
         System.out.println(a+"is negative  number");
      }
        
      }
      }