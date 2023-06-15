import java.util.*;
class StringExercises
  {
    public static void main(String[] ar)
    {
    /* adding one string at the end of another
     1. + operator
    System.out.println(string + " " + s);
    System.out.println(s + " " + string);
    /* 2. concat()
     System.out.println(string.concat(s));
     System.out.println(s.concat(string)); */

      //1. ==opeartor
      //2.compareTo()
      //3.equals
  String s1=new String("Hi");
String s2=new String("hi");
      String s3="g";
System.out.println(s1==s2);
      System.out.println(s1==s3);
      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));

    /*compareto method
      output--+ve==  first>second
      -ve ===first<second

  System.out.println(s1.compareTo(s2));
      System.out.println(s1.compareTo(s3));

    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.startsWith("gi"));*/
String st=new String("welcome to bitlabs");
      char[] c=new char[30];
    st.getChars(2,3,c,0);
      System.out.println(c);
//Bytes
       byte[] b=st.getBytes();
      for(byte i:b)
        {
          System.out.println(i);
      }
//character array
 /* char[] ch=st.toCharArray();
      for(char j:ch)
        {
          System.out.println(j);
        }*/
    System.out.println(st.substring(3,7));
    System.out.println(st.toUpperCase());
    System.out.println(st.toLowerCase());
    System.out.println(st.toString());
    System.out.println(st.indexOf("co",5));
   System.out.println(st.lastIndexOf("co"));
    }
  }