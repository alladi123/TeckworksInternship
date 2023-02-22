public class PrintAscii
  {
    public static void ascii()
    {
      System.out.println("Display the Ascii Characters:")
   for (int i = 33; i < 128; i++) {
            System.out.println(i+":" +(char)i);
        }
    }
public static void main(String[] ar)
    {
      ascii();
    }
  }