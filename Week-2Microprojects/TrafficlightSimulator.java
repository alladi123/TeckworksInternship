import java.util.*;

public class TrafficlightSimulator {
  public static void traffic(int time){
     if (time >= 1 && time <= 20) {
      System.out.println("GREEN");

      System.out.println("GO--->");
    } else if (time >= 20 && time <= 40) {
      System.out.println("RED");
      System.out.println("-----STOP-----");
    } else if (time >= 40 && time <= 60) {
      System.out.println("YELLOW");
      System.out.println("---->READY");
    } else {
      System.out.println("enter valid time");
    }
    
  }
  public static void main(String args[]) {
    System.out.println("Traffic Light Simulator");
    System.out.println("Time of day is 60 seconds");
    System.out.println("Enter the time:");
    Scanner s = new Scanner(System.in);
    int time = s.nextInt();
    TrafficlightSimulator t=new TrafficlightSimulator();
   t.traffic(time);

  }
}
