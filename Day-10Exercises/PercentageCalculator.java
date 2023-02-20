import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks obtained: ");
        int marksObtained = scanner.nextInt();
        System.out.print("Enter total marks: ");
        int totalMarks = scanner.nextInt();
        
  double percentage = (double) marksObtained / totalMarks * 100;
        double roundedPercentage = Math.round(percentage * 100.0) / 100.0;
        
        System.out.println("Your percentage is: " + roundedPercentage + "%");
    }
}
