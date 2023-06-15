import java.util.*;
class HospitalMain
  {
    public static void main(String[] args)
    {
      char ch;
      int option1;
      Scanner s=new Scanner(System.in);
     HospitalImplementation obj=new HospitalImplementation();
  System.out.println("1.Add patient details");
  System.out.println("2.view data");
  System.out.println("3.search patient  by id");
  System.out.println("4.search patient  by age");
  System.out.println("5.search Pateint by city");
      
      do
      {
        System.out.println("enter your choice");
        option1=s.nextInt();
        switch(option1)
          {
            case 1: obj.add_Patient();
              break;
            case 2: obj.view_data();
              break;
            case 3: obj.search_by_id();
              break;
            case 4: obj.search_by_age();
              break;
            case 5:obj.search_city();
              break;
            default: 
              System.out.println("invalid option");
              break;
      }
  
        System.out.println("do you want to continue one more operation");
        ch=s.next().charAt(0);
      }
        while(ch!='n');
        }
      
}
  