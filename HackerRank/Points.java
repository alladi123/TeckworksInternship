import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Points
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
          int p1=s.nextInt();
          int p2=s.nextInt();
          int q1=s.nextInt();
          int q2=s.nextInt();
          int a=p1+q1;
          int b=p2+q2;
          System.out.println(a+" "+b);
          //System.out.println(p2+q2);
          
        }
    }
}

    