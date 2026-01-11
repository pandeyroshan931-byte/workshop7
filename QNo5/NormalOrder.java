package QNo5;

public class NormalOrder extends Order {

    public NormalOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }
    @Override
    public double calculateFinalAmount() {
        
        return super.calculateFinalAmount() + 100;
    }

    public double calculateFinalAmount(double discountAmount) {
        return calculateFinalAmount() - discountAmount;
    }
}
