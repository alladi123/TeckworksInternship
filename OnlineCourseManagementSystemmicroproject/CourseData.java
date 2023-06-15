class CourseData
  {
    String course_name;
    String course_category;
    String duration;
    int trainedstudents_forcourse;
    double discount_course;
    double course_price;
    CourseData(String course_name,String course_category,String duration,int trainedstudents_forcourse,double discount_course,double course_price)
    {
      this.course_name=course_name;
      this.course_category=course_category;
      this.duration=duration;
      this.trainedstudents_forcourse=trainedstudents_forcourse;
      this.discount_course=discount_course;
      this.course_price=course_price;
    }
	
	public String getCourse_name() {
		return course_name;
	}

	
	public String getCourse_category() {
		return course_category;
	}

	
	public String getDuration() {
		return duration;
	}

	

	public int getTrainedstudents_forcourse() {
		return trainedstudents_forcourse;
	}

	public double getDiscount_course() {
		return discount_course;
	}

	
	public double getCourse_price() {
		return course_price;
	}

public String toString()
    {
      return "course name:"+" "+getCourse_name()+"category:"+getCourse_category()+" "+"duration:"+" "+getDuration()+" "+"price:"+getCourse_price();
    }
    
  }