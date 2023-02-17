import java.util.*;

public class Rockpaperscissor {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("combinations are:");
    System.out.println("1.player1 vs player2");
    System.out.println("2.User vs Computer");
    System.out.println("enter the combination:");

    int choice = s.nextInt();
    System.out.println("choices are:");
    System.out.println("1.Rock");
    System.out.println("2.Paper");
    System.out.println("3.Scissor");
    if (choice == 2) {
      int computer_choice;
      Random r = new Random();
      computer_choice = r.nextInt(3);

      System.out.println("enter your choice:");
      int user_choice = s.nextInt();
      switch (user_choice) {
        case 1:
          System.out.println("I choose Rock");
          break;
        case 2:
          System.out.println("I choose Paper");
          break;
        case 3:
          System.out.println("I choose Scissor");
          break;
      }
      switch (computer_choice) {
        case 1:
          System.out.println("computer choose Rock");
          break;
        case 2:
          System.out.println("computer choose Paper");
          break;
        case 3:
          System.out.println("computer  choose Scissor");
          break;
      }
      if (computer_choice == user_choice) {
        System.out.println("match tie");
      } else if (computer_choice == 1 && user_choice == 2) {
        System.out.println("I won!! and computer lose");
      } else if (computer_choice == 1 && user_choice == 3) {
        System.out.println("computer won");
      } else if (computer_choice == 2 && user_choice == 1) {
        System.out.println("computer won");
      } else if (computer_choice == 2 && user_choice == 3) {
        System.out.println("I won!! and computer lose");
      } else if (computer_choice == 3 && user_choice == 1) {
        System.out.println("I won!! and computer lose");
      } else if (computer_choice == 3 && user_choice == 2) {
        System.out.println("computer won");
      }
    } else {
      System.out.println("enter player1 choice:");
      int player1 = s.nextInt();
      System.out.println("enter player2 choice:");
      int player2 = s.nextInt();
      switch (player1) {
        case 1:
          System.out.println("player1 choose Rock");
          break;
        case 2:
          System.out.println(" player1 choose Paper");
          break;
        case 3:
          System.out.println("player1 choose Scissor");
          break;
      }
      switch (player2) {
        case 1:
          System.out.println("player2 choose Rock");
          break;
        case 2:
          System.out.println("player2 choose Paper");
          break;
        case 3:
          System.out.println("player2  choose Scissor");
          break;
      }
      if (player1 == player2) {
        System.out.println("match tie");
      } else if (player1 == 1 && player2 == 2) {
        System.out.println("player2 won and player1 lose");
      } else if (player1 == 1 && player2 == 3) {
        System.out.println("player1 won");
      } else if (player1 == 2 && player2 == 1) {
        System.out.println("player1 won");
      } else if (player1 == 2 && player2 == 3) {
        System.out.println("player2 won and player1 lose");
      } else if (player1 == 3 && player2 == 1) {
        System.out.println("player2 won and player1 lose");
      } else if (player1 == 3 && player2 == 2) {
        System.out.println("player1 won");
      }
    }

  }
}
