import java.util.*;

class Electricitybill {
  public static void main(String al[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Electricity bill App");
    System.out.println("Do you have a previous bill");
    char option = s.next().charAt(0);
    if (option == 'y') {
      System.out.println("enter your previous bill units:");
      int previous_units = s.nextInt();
      System.out.println("enter your present bill units:");
      int present_units = s.nextInt();
      float total = previous_units + present_units;
      if (total >= 100 && total <= 200) {
        System.out.println("units cost is: 1.20rupees");
        double cost = total * 1.20;
        System.out.println("yours GST is 10%");
        double gst = (cost * 10) / 100;
        System.out.println("your Electricity bill is: " + (gst + cost));
      } else if (total > 200 && total <= 400) {
        System.out.println("units cost is: 1.50rupees");
        double cost = total * 1.50;
        System.out.println("yours GST is 25%");
        double gst = (cost * 25) / 100;
        System.out.println("your Electricity bill is: " + (gst + cost));
      } else if (total > 400 && total <= 600) {
        System.out.println("units cost is: 1.80rupees");
        double cost = total * 1.80;
        System.out.println("yours GST is 30%");
        double gst = (cost * 30) / 100;
        System.out.println("your Electricity bill is: " + (gst + cost));
      } else if (total > 600) {
        System.out.println("units cost is: 2.05rupees");
        double cost = total * 2.05;
        System.out.println("yours GST is 40");
        double gst = (cost * 40) / 100;
        System.out.println("your Electricity bill is: " + (gst + cost));
      } else {
        System.out.println("your Electricity bill is:" + (present_units * 1.0));
      }
    } else {
      System.out.println("enter your present bill units:");
      int present_units = s.nextInt();
      if (present_units >= 100 && present_units <= 200) {
        System.out.println("units cost is: 1.20rupees");
        double cost = present_units * 1.20;
        System.out.println("yours GST is 10%");
        double gst = (cost * 10) / 100;
        System.out.println("your Electricity bill is: " + (gst + cost));
      } else if (present_units > 200 && present_units <= 400) {
        System.out.println("units cost is: 1.50rupees");
        double cost = present_units * 1.50;
        System.out.println("yours GST is 25%");
        double gst = (cost * 25) / 100;
        System.out.println("your Electricity bill is: " + (gst + cost));
      } else if (present_units > 400 && present_units <= 600) {
        System.out.println("units cost is: 1.80rupees");
        double cost = present_units * 1.50;
        System.out.println("yours GST is 30%");
        double gst = (cost * 30) / 100;
        System.out.println("your Electricity bill is: " + (gst + cost));
      } else if (present_units > 600) {
        System.out.println("units cost is: 2.05rupees");
        double cost = present_units * 2.05;
        System.out.println("yours GST is 40%");
        double gst = (cost * 40) / 100;
        System.out.println("your Electricity bill is: " + (gst + cost));
      } else {
        System.out.println("your Electricity bill is:" + (present_units * 1.0));
      }
    }

  }
}
