package wrokshop7;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
          
    double length;
    double breadth;
    
    void display()
    {
        System.out.println("length" +length);
        System.out.println("length" +breadth);
    }
    
    void calculation()
    {
       double area = length*breadth;
       System.out.println("area" +area);
    }
}