package wrokshop7;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    double subject1;
    double subject2;
    double subject3;
    double total;
    public Result(double mark1,double mark2,double mark3){
        this.subject1 =mark1;
        this.subject2 =mark2;
        this.subject3 =mark3;
        
    }
    
    void total(){
        
         total = subject1+subject2+subject3;
        System.out.println("Total  "+ total);
    }
    
    void prec()
    {
        double percentage = (total/300)*100;
    }
}