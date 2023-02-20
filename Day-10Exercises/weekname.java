import java.util.Scanner;


public class weekname  {
  public static void display(int week)
  {
    if(week==1){
           System.out.println("Monday");
           }
         else if(week==2){
        System.out.println("Tuesday");
          }
          else if(week==3){
           System.out.println("Wednesday");
           }
           else if(week==4){
           System.out.println("Thursday");
           }
           else if(week==5){
           System.out.println("Friday");
          }
           else if(week==6){
           System.out.println("Saturday");
           }
           else{
             System.out.println("Sunday");
  }        }
  
  public static void main(String args[]) {
    Scanner d=new Scanner(System.in);
    System.out.println("enter the week number:");
    int week=d.nextInt();
    weekname w=new  weekname();
    w.display(week);
  }
}
