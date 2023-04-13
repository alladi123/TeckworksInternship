import java.util.*;
class MedicineMain
  {
    public static void main(String[] args)
    {
      char ch;
      int option;
      Scanner s=new Scanner(System.in);
      MedicineImp obj=new MedicineImp();
  System.out.println("1.Add medicine details details");
  System.out.println("2.delete medicine record details");
  System.out.println("3.search medicine details");
  System.out.println("4.display medicine details");
      
      do{
        System.out.println("enter your choice");
        option=s.nextInt();
        switch(option)
          {
            case 1: obj.insertMedicinedetails();
              break;
            case 2: obj.deleteMedicine();
              break;
            case 3: obj.searchMedicine();
              break;
            case 4: obj.displayMedicines();
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
    
  