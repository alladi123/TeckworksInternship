/*Input             output
3
0 0 0               0
0 1 1               1
1 0 1               1*/

import java.util.*;
class Codechef1
  {
    	public static void main (String[] ar)
	{
	
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		while(n-->0)
		{
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
	if((a==0 && b==0 && c==0) || (a==1 && b==1 && c==1))
	
		{
		    System.out.println(0);
		}
		else{
		    System.out.println(1);
		}
		}
	}
}

  }