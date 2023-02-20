import java.util.*;
class Quadraticequation
  {
    public static void equation(int a,int b,int c)
    {
   int  k=(b*b)-4*a*c;
  int  s=k/2,t=0;
    while (s!=t)
            {
              t=s;
              s=(k/2+t)/2;
            }
       if(k==0)
            {
              int  r=-b/2*a;
          System.out.println("root is:"+r);
              }
       else if(s>0){
         int  q1=-b+(s)/2*a;
         int q2=-b-(s)/2*a;
  System.out.println("roots of q1 and q2 are :"+ q1+ " " +q2);
             }
         else{
          System.out.print("roots are not equal/no roots");
              }
    }
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the values of a,b and c:");
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      Quadraticequation q=new Quadraticequation();
      q.equation(a,b,c);
      
    }
  }