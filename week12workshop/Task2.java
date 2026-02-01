package week12workshop;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Write a description of class Task2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task2
{
    public static void main(String[] args){
        ArrayList<String> name= new ArrayList();
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        name.add("Rahul");
        name.add("Ayush");
        name.add("Gaurav");
        name.add("Neha");
        for(int arr:numbers)
        {
            System.out.println(arr);
            
            
        }
        Iterator<Integer> itr= numbers.iterator();
        while(itr.hasNext()){
            int num= itr.next();
            System.out.println(num);
            
        }
        name.remove(2);
        System.out.println(numbers.size());
        System.out.println(name.size());
        
        numbers.clear();
        System.out.println(numbers);
        
        System.out.println(name.get(2));
        System.out.println(name.get(4));

    }
    
}