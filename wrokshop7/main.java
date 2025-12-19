package wrokshop7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args){
        Book b1 = new Book();
        
        b1.title ="MunaMadan";
        b1.author = "Subro Chapagain";
        b1.price =258;
        b1.display();
        
        Book b2 = new Book();
        b2.title =" hahha";
        b2.author ="Parrot";
        b2.price =452;
        b2.display();
        
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 5;
        r1.display();
        r1.calculation();
        
        Rectangle r2 = new Rectangle();
        r2.length = 7;
        r2.breadth = 4;
        r2.display();
        r2.calculation();
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.id = 101;
        e1.name = "Ram";
        e1.salary = 25000;
        e1.displayemployee();
        e2.id = 102;
        e2.name = "Sita";
        e2.salary = 30000;
         e2.displayemployee();
        e3.id = 103;
        e3.name = "Hari";
        e3.salary = 28000;
        e3.displayemployee();  
        if(e1.salary>e2.salary && e1.salary>e3.salary){
            System.out.println("emp 1"+ e1.salary);
            
        }
        else if(e2.salary>e3.salary && e2.salary>e3.salary){
             System.out.println("emp 2"+ e2.salary);
        }
        else
            {
                System.out.println("emp 3" +e3.salary);
            }
            
            
                     
        Laptop l1 = new Laptop("Dell", 4, 75000);
        l1.display();
        Laptop l2 = new Laptop("HP", 4, 55000);
        l2.display();
        Laptop l3 = new Laptop("Nitro", 16, 180000);
        l3.display();
        
        
        
        Mobile m1 = new Mobile("Vivo",20000);
        m1.isaffordable();
        Mobile m2 = new Mobile("Infinix",50000);
        m2.isaffordable();
        


        Result re1 = new Result(55, 67, 78);
        re1.total();
        re1.prec();
        Result re2 = new Result(65, 47, 58);
        re2.total();
        re2.prec();
        Result re3 = new Result(34,25,63);
        re3.total();
        re3.prec();

    }
}