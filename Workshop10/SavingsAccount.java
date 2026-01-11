package Workshop10;

public class SavingsAccount extends Account {

    public SavingsAccount(int a, String n, double b) {
        super(a, n, b);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.05;
    }

    public double calculateInterest(double rate) {
        return getBalance() * rate;
    }
}
