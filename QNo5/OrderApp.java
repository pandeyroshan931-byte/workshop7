package QNo5;

public class OrderApp {
    public static void main(String[] args) {

        NormalOrder normalOrder =
                new NormalOrder(101, "Ram", 5000);

        PremiumOrder premiumOrder =
                new PremiumOrder(102, "Sita", 5000);

        System.out.println("---- NORMAL ORDER INVOICE ----");
        System.out.println(normalOrder);
        System.out.println("Final Amount: " +
                normalOrder.calculateFinalAmount(200));

        System.out.println("\n---- PREMIUM ORDER INVOICE ----");
        System.out.println(premiumOrder);
        System.out.println("Final Amount: " +premiumOrder.calculateFinalAmount(500));
    }
}
