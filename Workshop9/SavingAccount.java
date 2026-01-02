package Workshop9;


/**
 * Write a description of class shs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(int accountNumber, String name,
                          double balance, double interestRate) {
        super(accountNumber, name, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return super.getBalance() * interestRate / 100;
    }
}
