import java.util.*;
public class Numberguesser
  {
    
public static void main(String[] a)
  {
    System.out.println("NUMBER GUESSING GAME");
    char option;
    do{
    
  Scanner s=new Scanner(System.in);
  System.out.println("Guess the number:");
  int number=s.nextInt();
      Random r=new Random();
  System.out.println("enter system low and high limit values:");
      int high=s.nextInt();
      int low=s.nextInt();
      int res=r.nextInt(high-low)+low; 
  int system_guess=r.nextInt(res);
  System.out.println("system Random number is:"+system_guess);
    
   if(number==system_guess)
   {
     System.out.println("your guess is correct");
    }
      else{
        System.out.println("your guess is wrong");
      }
      System.out.println("do you want to repeat the process");
      
     option=s.next().charAt(0);
    
    }
    while(option!='n');
  }
  }