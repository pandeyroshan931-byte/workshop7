package Workshop11;


/**
 * Write a description of class Crop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Crop {

    private String cropName;
    private String season;
    private double landArea;
    public Crop(String cropName, String season, double landArea) {
        this.cropName = cropName;
        this.season = season;
        this.landArea = landArea;
    }
    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getLandArea() {
        return landArea;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    public abstract double calculateYield();
    public abstract double calculateWaterRequirement();

    public void displayCropInfo() {
        System.out.println("Crop: " + getCropName());
        System.out.println("Season: " + getSeason());
        System.out.println("Land Area: " + getLandArea());
    }
}
