package Workshop10;


/**
 * Write a description of class hah here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, "Rita", 50000);
        System.out.println(s);
        System.out.println("Interest: " + s.calculateInterest(0.06));
    }
}
