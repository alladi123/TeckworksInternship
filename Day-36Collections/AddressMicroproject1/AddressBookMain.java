import java.util.*;
class AddressBookMain 
  {
  public static void main(String[] args) 
  {
    char ch;
      int option;
      Scanner s=new Scanner(System.in);
     AddressBookImp obj=new AddressBookImp();
  System.out.println("1.Add contacts");
  System.out.println("2.edit contacts");
  System.out.println("3.delete contacts");
  System.out.println("4.search contacts");
      
      do{
        System.out.println("enter your choice");
        option=s.nextInt();
        switch(option)
          {
            case 1: obj.add_contacts();
              break;
            case 2: obj.edit_contacts();
              break;
            case 3: obj.delete_contacts();
              break;
            case 4: obj.search_contacts();
              break;
            default: 
              System.out.println("invalid option");
          }
        System.out.println("do you want to continue one more operation");
        ch=s.next().charAt(0);
      }
        while(ch!='n');
        
         
        }
  }
    
  
