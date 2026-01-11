package Workshop10;

public class CurrentAccount extends Account {

    public CurrentAccount(int a, String n, double b) {
        super(a, n, b);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }
}
