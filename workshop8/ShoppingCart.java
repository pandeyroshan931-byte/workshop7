package workshop8;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private String itemName;
    private double itemPrice;
    private int quantity;
    ShoppingCart(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    int getQuantity() {
        return quantity;
    }

    double calculateTotal() {
        return itemPrice * quantity;
    }

    double calculateDiscountedTotal(double discountPercent) {
        double total = calculateTotal();
        double discountAmount = total * discountPercent / 100;
        return total - discountAmount;
    }
    void displayCart() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Item Price : " + itemPrice);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Price : " + calculateTotal());
    }
}