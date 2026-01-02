package Workshop9;


/**
 * Write a description of class BIke here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class Bike extends Vehicle {
    int engineCapacity;

    public Bike(int vehicleId, String brand, double basePrice, int engineCapacity) {
        super(vehicleId, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }

    public double calculateFinalPrice() {
        return basePrice + calculateTax();
    }
}