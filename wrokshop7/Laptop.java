package wrokshop7;


/**
 * Write a description of class Laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Laptop
{
   String brand;
   int ram;
   double price;
   
   public Laptop(String brand,int ram, double price){
       this.brand = brand;
        this.ram = ram;
        this.price = price;
   }
   void display() {
       
       if(ram> 8){
        System.out.println("Brand " + brand);
        System.out.println("ram " + ram +"gb");
        System.out.println("Price " + price);
    }
}
}