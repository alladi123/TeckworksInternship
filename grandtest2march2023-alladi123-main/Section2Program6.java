import java.util.*;
class Section2Program6
  {
    public static void display(char a[])
    {
      int x,y,z;
      for(int i=0;i<a.length-3;i++)
        {
          x=a[i];
          y=a[i+1];
          z=a[i+2];
          if((y-x)==1 && (z-y)==1)
          {
            System.out.println("YES");
             return;  
          }
        }
     System.out.println("NO");     
  }
       public static void main(String[] args)
     {
         Scanner s=new Scanner(System.in);
         String s1=s.nextLine();
       char c[]=s1.toCharArray();
       display(c);
     }
  }