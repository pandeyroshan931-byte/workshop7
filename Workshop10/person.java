package Workshop10;


/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class person
{
    private int id;
    private String name;
    
    public person(int id,String name)
    {
        this.id= id;
        this.name= name;
        
    }
    public void setId(int id){
        this.id= id;
        
    }
    public int getId()
    {
        return this.id;
    }
    public void setname(String newname){
        this.name= newname;
    }
    public String getname()
    {
        return this.name;
        
    }
    @Override
    public String toString()
    {
        return "Student details ---> student id:"+ getId() +",student name: "+getname();
    }
    public double calculateSalary()
    {
        return 10000;
    }
}