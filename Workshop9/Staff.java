package Workshop9;


/**
 * Write a description of class jka here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person {
    int workingHours;
    double ratePerHour;

    public Staff(int id, String name, int workingHours, double ratePerHour) {
        super(id, name, 0);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    public double calculateSalary() {
        return workingHours * ratePerHour;
    }
}
