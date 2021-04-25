public class ActiveCourse {
    public ActiveCourse(){

    }
    public ActiveCourse(String courseName, String courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }
    public void Add(){
        System.out.println("Course Added");
    }
    public void Delete(){
        System.out.println("Course Deleted");
    }


    String courseName;
    String courseType;
}



