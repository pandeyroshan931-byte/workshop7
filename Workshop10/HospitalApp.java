package Workshop10;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main(String[] args) {

        Doctor d = new Doctor(1, "Dr. Ram", 50000, "Cardio", 10000);
        nurse n = new nurse(2, "Sita", "Night", 3000);

        System.out.println(d);
        System.out.println("Doctor Salary: " + d.calculateSalary(5));

        System.out.println(n);
        System.out.println("Nurse Salary: " + n.calculateSalary());
    }
}