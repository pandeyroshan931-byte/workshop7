package week12tuto;


/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
    private int id;
    private String name;
    
    public student(int id, String name){
        this.id = id;
        this.name= name;
    }
    @Override
    public String toString(){
        return "id: "+this.id +"name:" +this.name;
    }
}