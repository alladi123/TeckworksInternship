import java.util.Scanner;


public class Marks {
  public static void grade(float physics, float chemistry,float biology,float maths,float computer)
  {
float percentage =(physics+biology+maths+chemistry+computer) / 3;
    System.out.println("student percentage is"+percentage);
    if (percentage >= 90) {
      System.out.println("grade A");
    } else if (percentage >= 80 && percentage<90) {
      System.out.println("grade B");
    } else if (percentage >= 70 && percentage<80) {
      System.out.println("grade c");
    } else if (percentage >= 60 && percentage<70) {
      System.out.println("grade D");
    } else {
      System.out.println("grade F");
    }
    
  }
  
  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    float physics, chemistry,biology,maths,computer;
   System.out.println("enter the  physics marks:");
    physics= s.nextInt();
   System.out.println("enter the  chemistry marks:");
    chemistry = s.nextInt();
   System.out.println("enter the  biology marks:");
    biology = s.nextInt();
     System.out.println("enter the  maths marks:");
    maths = s.nextInt();
     System.out.println("enter the  computer marks:");
    computer = s.nextInt();
    Marks m=new Marks();
    m.grade( physics,chemistry,biology,maths, computer);

}
}

