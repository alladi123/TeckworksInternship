import java.util.Arrays;
import java.util.*;
 
class SameArray
{
static int MinOperation(int a[],
                        int b[],
                        int n)
{
    Arrays.sort(a);
    Arrays.sort(b);
  int result=0;
      for (int i = 0; i < n; ++i)
    {
        if (a[i] > b[i])
        {
          while(a[i]>0 && b[i]>0)
            {
          int r1=a[i]%10;
           int r2=b[i]%10;
            result = result +
                     Math.abs(r1 - r2);
        }
        }
        else if (a[i] < b[i])
        {
             while(a[i]>0 && b[i]>0)
            {
          int r1=a[i]%10;
           int r2=b[i]%10;
            result = result +
                     Math.abs(r1 - r2);
            }
    }
    }
 
    return result;
}

public static void main (String[] args)
  {
    
  Scanner s=new Scanner(System.in);
    int size=s.nextInt();
    int a[]=new int[size];
    int b[]=new int[size];
    for(int i=0;i<=size-1;i++)
      {
        a[i]=s.nextInt();
      }
     for(int i=0;i<=size-1;i++)
      {
        b[i]=s.nextInt();
      }
    int n = a.length;
    System.out.println(MinOperation(a, b, n));
}
}