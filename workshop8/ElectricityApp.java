package workshop8;


/**
 * Write a description of class ElectricityApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityApp
{
    public static void main(String[] args) {

        ElectricityBill bill = new ElectricityBill("Roshan", 150);
        System.out.println("Consumer Name : " + "Roshan");
        System.out.println("Units Consumed : " + bill.getUnitsConsumed());
        System.out.println("Total Bill : ₹" + bill.calculateBill());
    }
}