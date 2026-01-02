package Workshop9;


/**
 * Write a description of class VehicleApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class VehicleApp {
    public static void main(String[] args) {

        Car c1 = new Car(101, "Toyota", 2000000, 4, "Petrol");
        Bike b1 = new Bike(102, "Yamaha", 300000, 150);
        
        c1.displayVehicleInfo();
        System.out.println("Tax: " + c1.calculateTax());
        System.out.println("Final Price: " + c1.calculateFinalPrice());
        b1.displayVehicleInfo();
        
    }
}