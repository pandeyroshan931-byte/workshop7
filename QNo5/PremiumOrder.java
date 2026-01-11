package QNo5;

public class PremiumOrder extends Order {

    public PremiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }
    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount();
    }

    public double calculateFinalAmount(double discountAmount) {
        return getAmount() - discountAmount;
    }
}
