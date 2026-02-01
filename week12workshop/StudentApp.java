package week12workshop;
import java.util.ArrayList;


/**
 * Write a description of class StudentApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentApp
{
    public static void main(String[] args){
         ArrayList<Student> students = new ArrayList();
         students.add(new Student("Rahul", "L1M1", 9876543210L));
        students.add(new Student("Ayush", "L1C1", 9123456780L));
        students.add(new Student("Gaurav", "L1A1", 9012345678L));
        for (Student s : students) {
            System.out.println(s);
        }
        for(int i=0;i< students.size();i++){
            if(students.get(i).getName().equals("Gaurav"))
            {
                students.remove(i);
            }
        }
         for (Student s : students) {
            if (s.getName().equals("Rahul")) {
                s.setGroup("L1N2");
            }
        }
        students.set(0,new Student("Aavaya","L1C1",9876543213L));
        for (Student s : students) {
            if (s.getName().equals("Ayush")) {
                s.setName("Aayush");
            }
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}