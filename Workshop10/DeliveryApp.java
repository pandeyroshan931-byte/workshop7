package Workshop10;

public class DeliveryApp {
    public static void main(String[] args) {
        BikeDelivery b = new BikeDelivery(1, "Hari", 8000);
        CarDelivery c = new CarDelivery(2, "Gopal", 12000);

        System.out.println(b);
        System.out.println("Bike Pay: " + b.calculatePayment(10));

        System.out.println(c);
        System.out.println("Car Pay: " + c.calculatePayment(5));
    }
}
