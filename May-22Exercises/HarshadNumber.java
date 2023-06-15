// 21/2+1=7
public class HarshadNumber {
  public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
   int n=s.nextInt();
		int result=0;
		
		while(n!=0)
		{
			int r= n%10;
			result=result+r;
			n=n/10;
		}
		if(n%result==0)
      {
      System.out.println("Harshad Number");
      }
    else
      {
        System.out.println("Not a Harshad Number");
      }
}
}