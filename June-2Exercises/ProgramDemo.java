import java.util.*;

class numberException extends Exception {
  public numberException(String message) {
    super(message);
  }
}

class ProgramDemo {
  public static void error(int number) throws numberException {
    try {
      if (number > 18) {
        System.out.println("you are eligible");
      } else {
        throw new numberException("error enter valid age");
      }
    } catch (numberException e) {
      System.out.println(e.getMessage());
    }

  }

  public static void main(String[] r) {
    Scanner s = new Scanner(System.in);
    int age = s.nextInt();
    ProgramDemo d = new ProgramDemo();
    try {
      d.error(age);
    } catch (numberException n) {
      System.out.println(n.getMessage());
    }
  }
}