package wrokshop7;


/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{
    String brand;
    int price;
    
    
    public Mobile(String brand,int price){
        this.brand = brand;
        this.price = price;
    }
    void isaffordable()
    {
        if(price<20000)
        {
            System.out.println("brand " +brand);
             System.out.println("price " +price);
        }
        
        
    }
}