import java.util.*;
class CourseImplementation implements CourseInterface
  {
  ArrayList<CourseData> list=new ArrayList<>();
    Scanner s=new Scanner(System.in);
    public void add_Course()
    {
      
      System.out.println("enter the courses details:");
    String course_name=s.next();
    String course_category=s.next();
    String duration=s.next();
    int trainedstudents_forcourse=s.nextInt();
    double discount_course=s.nextDouble();
    double course_price=s.nextDouble();
list.add(new CourseData(course_name,course_category,duration,trainedstudents_forcourse,discount_course,course_price));
    }
   public  void view_Courses()
    {
      System.out.println("display the available courses");
      if(list.size()==0)
      {
        System.out.println("no courses are available here");
      }
      else
      {
        Iterator it=list.iterator();
        while(it.hasNext())
          {
            System.out.println(it.next());
          }
      }
      
    }
    public void searchCourseBy_name()
    {
       System.out.println("enter the course name to be search:");
       if(list.size()==0)
       {
         System.out.println("no courses are available");
       }
      else
       {
         String check=null;
         System.out.println("enter the course to be search:");
         String course_name=s.next();
         for(CourseData c:list)
           {
             if(c.getCourse_name()==course_name)
             {
      System.out.println(c.getCourse_name()+" "+c.getCourse_category()+" "+c.getDuration()+" "+c.getTrainedstudents_forcourse()+" "+c.getDiscount_course()+" "+c.getCourse_price());
               check="found";
               break;
             }
             if(check==null)
             {
          System.out.println("given course is not available");     
             }
           }
       }
        
    }
    public void searchby_category()
    {
      System.out.println("enter the category to be search:");
      String category=s.next();
     for(CourseData c:list)
    {
      if(c.getCourse_category()==category)
      {
        System.out.println("given catelogue is available");
        
      }
      else{
        System.out.println("given catelogue is not available");
      }
    }
    }
 public  void remove_Courses()
    {
    System.out.println("enter the course name to be deleted:");
      if(list.size()==0)
       {
         System.out.println("no courses are available");
       }
      else{
         String check=null;
         System.out.println("enter the course to be search:");
         String course_name=s.next();
        for(CourseData c:list)
          {
           if(c.getCourse_name()==course_name)
           {
             list.remove(c);
             check="found";
             break;
           }
          }
        if(check==null)
        {
      System.out.println("given course is already deleted");
        }
      }
    }
  }
