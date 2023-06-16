/*Challenge-5: 

Mike was enthusiastic to attend the "Kracker Jack Fun Fair 2023" and couldn't wait to participate in the Number Challenge. Being a math expert, he was given a string D of numbers that only contained 0's and 1's. The challenge was to change exactly one digit from the given string to make all the digits in the string the same. If it was possible to make all the digits equal by flipping only one digit, he had to output "Yes". If it was not possible, he had to output "No". Can you write a program to help Mike win the challenge? 

Input Format: 

The first and only input contains a string D consisting of only 0's and 1's. 

Output Format: 

Output "Yes" if it is possible to make all digits in the string the same by flipping exactly one digit. Otherwise, output "No". 

Refer to the sample input and output for formatting specifications. 

Sample Input 1: 

101 

Sample Output 1: 

Yes 

Sample Input 2: 

11 

Sample Output 2: 

No 
*/
import java.util.*;
class Challenge5
  {
    public static void checkString(String s)
    {
      int one_count=0,zero_count=0;
      String s1="";
      for(int i=0;i<=s.length()-1;i++)
        {
          if(s.charAt(i)=='1')
          {
            one_count++;
          }
          else{
            zero_count++;
          }
        }
    if(s.length()==one_count || s.length()==zero_count)
        {
        System.out.println("NO");
        }
      else{
        System.out.println("YES");
       }
        }
  public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      int testcase=2;
      while(testcase-->0)
        {
      System.out.println("enter the string:");
    String str=s.next();
      checkString(str);
        }
    }
  }