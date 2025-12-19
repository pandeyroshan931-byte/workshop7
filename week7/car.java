package week7;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class car
{
        String brand;
        String colour;
        String model;
        int price;
        String owner;
        
       void drive()
       {
           System.out.println(owner + "Is driving");
       }
       void braking()
       {
           System.out.println(owner +"Is braking");
       }
    }