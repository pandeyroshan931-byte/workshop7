package workshop8;


/**
 * Write a description of class StudentTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    public static void main(String[] args){
        Student st1 = new Student("Roshan",101,"Kathmandu",89298622L,"Hwa college");
        st1.displayInfo();
        
        st1.setName("hwa");
        st1.setId(201);
        st1.displayInfo();
        
        
    }
}