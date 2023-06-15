import java.util.*;
class MainCourse
  {
    public static void main(String[] args)
    {
       char ch;
      int option;
      Scanner s=new Scanner(System.in);
      CourseImplementation objlist=new CourseImplementation();
  System.out.println("1.Add course details");
  System.out.println("2.view courses");
  System.out.println("3.search courses by name");
  System.out.println("4.remove courses by name");
      
      do
      {
        System.out.println("enter your choice");
        option=s.nextInt();
        switch(option)
          {
            case 1: objlist.add_Course();
              break;
            case 2: objlist.view_Courses();
              break;
            case 3: objlist.searchCourseBy_name();
              break;
            case 4: objlist.remove_Courses();
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
  