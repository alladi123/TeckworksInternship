import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int c=0;
        /* Enter your code here. Print output to STDOUT. */
        String s1="";
        for(int i=A.length()-1;i>=0;i--)
        {
            s1+=A.charAt(i);
        }
      System.out.println(s1);
        for(int j=0;j<=A.length()-1;j++)
        {
            if(A.charAt(j)==s1.charAt(j))
            {
                c++;
            }
        }
        if(c==A.length())
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}



