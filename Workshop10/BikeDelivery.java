package Workshop10;

public class BikeDelivery extends DeliveryPartner {

    public BikeDelivery(int id, String name, double pay) {
        super(id, name, pay);
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 200;
    }

    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 50);
    }
}
