package Workshop9;


/**
 * Write a description of class PayRoll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayRoll
{
    public static void main(String[] args) {
        PermanentEmployee pe =new PermanentEmployee(1, "Ram", 30000, 5000, 4000);
        ContractEmployee ce =new ContractEmployee(2, "Shyam", 1000, 20);
        System.out.println("PERMANENT EMPLOYEE");
        pe.displayEmployee();
        System.out.println("Total Salary: " + pe.calculateTotalSalary());
        System.out.println("\nCONTRACT EMPLOYEE ");
        ce.displayEmployee();
        System.out.println("Total Salary: " + ce.calculateTotalSalary());
    }
}