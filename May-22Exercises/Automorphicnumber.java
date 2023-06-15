//76*76=5776
import java.util.*;
public class Automorphicnumber 
{   
 static boolean isAutomorphic(int num)   
{   
int square=num*num;   

while (num>0)   
{   
if (num%10!=square%10)   
 return false;   
 num = num/10;   
square = square/10;   
}   
return true;   
}   
 
public static void main(String args[])   
{
  Scanner s=new Scanner(System.in);
 int n=s.nextInt();
  if(isAutomorphic(n))
  {
    System.out.println("Automorphic number");
  }
  else{
    System.out.println("Not Automorphic number");
  }
  

}   
}  