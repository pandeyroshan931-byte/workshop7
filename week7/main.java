package week7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    //attributes or properties
   public static void main(String[] args){
       Student s1= new Student();
       s1.collegeid= "np0983p10";
       s1.name= "Roshan";
       s1.age= 17;
       s1.study();
       
       System.out.println(s1.collegeid);
       System.out.println(s1.name);
       System.out.println(s1.age);
       
       Student s2= new Student();
       s2.collegeid= "np045i02";
       s2.name= "Hwa";
       s2.age= 70;
       s2.laugh();
       
       System.out.println(s2.collegeid);
       System.out.println(s2.name);
       System.out.println(s2.age);
       
       car c1= new car();
       c1.brand = "bugatti";
        c1.colour = "black";
        c1.model = "Tourbillon";
        c1.price= 72379282;
        c1.owner= "hwa";
       c1.drive();
       c1.braking();
       
       System.out.println(c1.brand);
       System.out.println(c1.colour);
       System.out.println(c1.model);
       System.out.println(c1.price);
       
        
       
   }
   
}