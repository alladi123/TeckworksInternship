import java.util.*;
/*Create a Person class with an instance variable age as a parameter. Validate a person's age in validate () method make sure it is a +ve number. Once the age value is positive test whether the person is eligible to vote or not in Eligibility(), */
class Person
  {
    public int age;
  public void get_age(int age)
    {
      this.age=age;
    }
   /* public void validate()
    {
      if(age>0)
      {
        eligibility();
      }
      else{
        System.out.println("enter valid age");
      }
    }
    public void eligibility()
    {
     if(age>=18)
        {
          System.out.println("your are eligible to vote");
        }
        else{
          System.out.println("your are not eligible to vote");
        }
      }
    }
*/
  public boolean validate()
    {
     if(age>0)
      {
        return true;
      }
    return false;
    }
    public void eligibility()
    {
      if(age>=18)
        {
          System.out.println("your are eligible to vote");
        }
        else{
          System.out.println("your are not eligible to vote");
        }
      }
    }
class PersonMain
  {
    public static void main(String[] r)
    {
      Person p=new Person();
      p.get_age(19);
    boolean p1=p.validate();
      if(p1==true)
      {
     p.eligibility();
      }
      else{
        System.out.println("enter valid age");
      }
    }
  }