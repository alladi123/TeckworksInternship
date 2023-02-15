import java.util.Scanner;
//find maximum number between three numbers
class maximumThreenum {
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      if(a>b && a>c){
        System.out.println(a+" is maximum number");
      }
      else if(b>c && b>a)
        {
        System.out.println(b+"is a maximum number");
        }
      else if(a==b && b==c){
        System.out.println("three numbers are equal");
      }
      else{
        System.out.println(c+"is a maximum number");
      }
    }
}