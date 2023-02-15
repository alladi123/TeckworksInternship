import java.util.Scanner;
//student details
class StudentDetails
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      String name=s.next();
      int m1,m2,m3;
      m1=s.nextInt();
      m2=s.nextInt();
      m3=s.nextInt();
      int average=m1+m2+m3/3;
      System.out.println("student number is"+num);
      System.out.println("student name is"+name);
      System.out.println("average marks is"+average);
    }
  }