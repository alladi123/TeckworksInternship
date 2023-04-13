import java.util.*;
class OverloadingGrades
  {
    public  void grades(int m1,int m2,int m3)
    {
      double average=m1+m2+m3/3;
      if(average>50)
      {
        System.out.println("Grade A");
      }
      else{
         System.out.println("Grade B");
      }
      
    }
    public void grades(double phy,double che)
    {
      double average=phy+che/3;
      if(average>50)
      {
        System.out.println("Grade A");
      }
      else{
         System.out.println("Grade B");
      }
    }
  }
    public class OverloadingMain{
      
  public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.print("enter m1 marks:");
      int m1=s.nextInt();
      System.out.print("enter m2 marks:");
      int m2=s.nextInt();
      System.out.print("enter m3 marks:");
      int m3=s.nextInt();
      System.out.print("enter  physics marks:");
      double phy=s.nextDouble();
      System.out.print("enter chemistry marks:");
      double che=s.nextDouble();
      OverloadingGrades g=new OverloadingGrades();
      g.grades(m1,m2,m3);
      g.grades(phy,che);
    }
  }
  
  