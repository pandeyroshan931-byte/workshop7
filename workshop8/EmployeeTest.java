package workshop8;


/**
 * Write a description of class EmployeeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTest
{
    public static void main(String[] args){
        Employee e1= new Employee(1000);
        double gross = e1.calculateGrossSalary();
        System.out.println("The gross salary is"+ gross);
    }
}