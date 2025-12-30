package workshop8;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Laptop", 60000, 1);
        cart.displayCart();

        cart.setQuantity(2);

        System.out.println("\nAfter updating quantity:");
        cart.displayCart();
        double discountedPrice = cart.calculateDiscountedTotal(10);

        System.out.println("\nPrice after 10% discount: " + discountedPrice);
    }
}