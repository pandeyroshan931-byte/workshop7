package Workshop10;


/**
 * Write a description of class nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nurse extends person
{
    String shift;
    double extraAllowance;
    public nurse(int id,String name,String shift,double extraAllowance){
        super(id,name);
        this.shift = shift;
        this.extraAllowance= extraAllowance;
    }
    @Override
    public double calculateSalary()
    {
        return super.calculateSalary()+extraAllowance;
        
    }
    @Override
    public String toString(){
        return toString()+"Nurse Shift"+this.shift+"extraAllowance"+this.extraAllowance;
    }

    }