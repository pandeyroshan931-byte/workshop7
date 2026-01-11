package Workshop10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int partnerId;
    private String name;
    double basePay;

    public DeliveryPartner(int partnerId, String name, double basePay) {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;
    }
    public void setpartnerId(int partnerId)
    {
        this.partnerId=partnerId;
        
    }
    public int getpartnerId(){
        return this.partnerId;
    }
    public void setName(String name)
    {
        this.name=name;
        
    }
    public String getname(){
        return this.name;
    }
    public void setbasePay(double basePay)
    {
        this.basePay=basePay;
    }
    public double getbasePay(){
        return this.basePay;
    }
     public double calculatePayment() {
        return basePay;
    }
    @Override

    public String toString() {
        return "ID: " + partnerId + ", Name: " + name;
    }
}