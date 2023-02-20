import java.util.Scanner;

class Friendmobilenumber {
  static public void number(long phnumber) {
    int count = 0;
    long a;
    System.out.println("last four digits are:");
    while (phnumber != 0) {
      a = phnumber % 10;
      phnumber = phnumber / 10;
      count++;
      if (count >= 1 && count <= 4) {
        System.out.println(a);
      }
    }
  }
  public static void main(String[] args) {
    long n;
    Scanner s = new Scanner(System.in);
    System.out.println("enter your best friend mobile number:");
    long phnumber = s.nextLong();
    Friendmobilenumber f = new Friendmobilenumber();
    f.number(phnumber);
  }
}
