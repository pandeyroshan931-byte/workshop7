package week12tuto;
import java.util.ArrayList;


/**
 * Write a description of class studentApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class studentApp
{
    public static void main(String[] args){
        ArrayList<student> students= new ArrayList<>();
        students.add(new student(101,"harsh")); // 6th index --> 101,harsh
        students.add(new student(102,"hasan"));
        students.add(new student(103,"sumit"));
        
        System.out.println(students.get(0));
        
        for(student std: students){
            System.out.println(std);
            
        }
    }
}