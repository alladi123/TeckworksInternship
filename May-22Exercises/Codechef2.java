/*Input
3
3 1 1 3
1 1 1 2
2 1 1 1
  
Output
YES
YES
NO*/

import java.util.*;
class Codechef2
  {
    	public static void main (String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n-->0)
		{
		    int h=s.nextInt();
		    int x=s.nextInt();
		    int y=s.nextInt();
		    int c=s.nextInt();
		    int d=(x+(y/2))*h;
		    if(d<=c)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}

  }