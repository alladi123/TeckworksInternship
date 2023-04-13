import java.util.*;
class OverridingGrades
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
  }
class childoverriding extends OverridingGrades
  {
     public void grades(int phy,int che,int java)
    {
      double average=phy+che+java/3;
      if(average>50)
      {
        System.out.println("Grade A");
      }
      else{
         System.out.println("Grade B");
      }
      
  }
  }
 public class OverridingMain{
      
  public static void main(String[] args)
    {
      OverridingGrades ob=new OverridingGrades();
  
      Scanner s=new Scanner(System.in);
      System.out.print("enter m1 marks:");
      int m1=s.nextInt();
      System.out.print("enter m2 marks:");
      int m2=s.nextInt();
      System.out.print("enter m3 marks:");
      int m3=s.nextInt();
      System.out.print("enter physics marks:");
      int phy=s.nextInt();
      System.out.print("enter chemistry marks:");
      int che=s.nextInt();
      System.out.print("enter java marks:");
      int java=s.nextInt();
      ob.grades(m1,m2,m3);
      ob.grades(phy,che,java);
      
    }
  }
  