package week8;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args){
        
        Calculator calc = new Calculator();
        
        // invoking a method or method invocation
        
        calc.displayInfo();
        calc.add(10,8); //actual parameters
        
        calc.getFixedNumber ();
        int fixNum= calc.getFixedNumber();
        System.out.println("The fix number is :" +(fixNum));  
        
        int multi= calc.multiply(10,20);
        int multii= calc.multiply(30,40);
        System.out.println("The multiplication of first two numbers are " +multi);
        
        Calculator.square(10);
    }
}