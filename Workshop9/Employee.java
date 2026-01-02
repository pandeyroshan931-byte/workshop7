package Workshop9;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
   int employeeId;
    String name;
    double basicSalary;

    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
}
public double calculationBonus(){
    double bonus =basicSalary*0.1;
    return bonus;
}
public void displayEmployee() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
}
}