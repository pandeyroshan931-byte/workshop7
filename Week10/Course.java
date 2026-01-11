package Week10;


/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    private int courseId;
    private String courseName;
    private double baseFee;
    
    public Course(int courseId,String courseName,double baseFee){
        this .courseId= courseId;
        this. courseName= courseName;
        this. baseFee= baseFee;
        
    }
    public void setcourseId(int courseId){
        this.courseId= courseId;
        
    }
    public void setCourseId(String courseName){
        this.courseName= courseName;
        
    }
    public String getcourseName(){
        return this.courseName;
    }
    public void setbaseFee(double baseFee){
        this.baseFee =baseFee;
    }
    public double getbaseFee(){
        return this.baseFee;
    }
    public double calculateFee(){
        return this.baseFee;
    }
    public double calculateFee(double discountAmount){
        return this.baseFee= discountAmount;
    }
    public void displayCourse(){
        System.out.println("Course Id:" +this.courseId);
        System.out.println("Course Name:" +this.courseName);
    }
    
    
    
    
    
}

