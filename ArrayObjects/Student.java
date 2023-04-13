import java.util.*;
 
    class Student
    {  
      char grade;
    double average;
      void read()   
      {
      Scanner s=new Scanner(System.in);    
    System.out.println("Enter student grade");
        try
          {
    grade=s.next().charAt(0);
          }
        catch(InputMismatchException e)
          {
            System.out.println("Please enter integer data");
            read();
          }
    System.out.println("Enter student average");
        try
          {
   average=s.nextInt();
          }
        catch(Exception e)
          {
            System.out.println("Please enter double data");
            read();
          }
    System.out.println(grade+"  "+average);
      }
        
     public static void main(String a[])
    {
   Student m=new Student();
    m.read();
    
  }
  }