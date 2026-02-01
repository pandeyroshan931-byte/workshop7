package Workshop11;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop implements Transportable {

    public Rice(double landArea) {
        super("Rice", "Monsoon", landArea);
    }

    @Override
    public double calculateYield() {
        return getLandArea() * 4.5;
    }

    @Override
    public double calculateWaterRequirement() {
        return getLandArea() * 1200;
    }

    @Override
    public double calculateTransportCost() {
        return getLandArea() * 3000;
    }

    @Override
    public String getTransportMethod() {
        return "Tractor / Truck";
    }
}
