import java.util.Scanner;


public class Gradescalculator {
  
  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    System.out.println("how many students grades you want:");
    int number=s.nextInt();
    int studentnumber=1;
    while(number-->0)
      {
        
    System.out.println("enter the student number:"+studentnumber);
    float m1, m2, m3;
   System.out.println("enter the m1 marks:");
    m1 = s.nextInt();
   System.out.println("enter the m2 marks:");
    m2 = s.nextInt();
   System.out.println("enter the m3 marks:");
    m3 = s.nextInt();
    float percentage = (m1 + m2 + m3) / 3;
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
      studentnumber+=1;
    }
}
}

