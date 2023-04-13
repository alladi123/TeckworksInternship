import java.util.*;
class EncryptionDecryption
  {
    public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=new String(s.nextLine());
      System.out.println("enter the position:");
      int position=s.nextInt();
      String a2=Encryption(s1,position);
      System.out.println("encryption is:"+a2);
      String a1=Decryption(r,position);
      System.out.println("decryption is:"+a1);
      
    }
    public static String Encryption(String str,int position)
    {
      String r="";
      for(int i=0;i<str.length();i++)
        {
         r=r+(char)(str.charAt(i)+position%26);
          
        }
      return r;
    }
    public static String Decryption(String str2,int position)
    {
      String r1="";
      for(int i=0;i<str2.length();i++)
        {
         r1=r1+(char)(str2.charAt(i)-position%26);
          
          
        }
      return r1;
    }
  }