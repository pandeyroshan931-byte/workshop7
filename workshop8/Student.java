package workshop8;
import javafx.scene.layout.Pane;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private int id;
    public String address;
    public long phoneNumber;
    public static String collegeName;
    
    
    public Student(String name,int id,String address,long phoneNumber,String collegeName){
        this.name= name;
        this.id=id;
        this.address= address;
        this.phoneNumber=phoneNumber;
        this.collegeName=collegeName;
    }
    public void setName(String name)
    {
        this.name= name;
        
    }
    
    public void setId(int id)
    {
        this.id= id;
    }
    
    
    public void displayInfo()
    {
        System.out.println("Name of student" +name);
        System.out.println("Id of student" +id);
        System.out.println("Address of student" +address);
        System.out.println("phoneNumber of student" +phoneNumber);
        System.out.println("collegeName of student" +collegeName);
        
        
        
    }
}