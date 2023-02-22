import java.util.*;
class  PrintallPrime{

  public static int primegenerator(int n) 
  {
  
    for (int i = 2; i < n; i++) {
  
      if (n % i == 0) {
        return -1;
    
      }
    }
    return 1;
    }
  public static void main(String args[]) {
  
    Scanner s=new Scanner(System.in);
     System.out.println("PRIME NUMBERS GENERATOR");
    System.out.print("enter the starting number:");
    int start=s.nextInt();
     System.out.print("enter the ending limit:");
    int Primelimit=s.nextInt();
    for (int i = start; i <=Primelimit; i++) 
    {
      if (primegenerator(i) == 1)
      {
        System.out.print(i + " ");
      }
    }
  }
}