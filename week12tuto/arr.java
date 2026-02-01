package week12tuto;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Write a description of class arr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arr
{
    public static void main(String[] args){
        ArrayList<Integer> arrlist= new ArrayList();
        
        System.out.println(arrlist.isEmpty()); // true
        
        arrlist.add(95);
        arrlist.add(100);
        arrlist.add(35);
        
        System.out.println(arrlist);
        
        arrlist.add(0,85);
        
        System.out.println(arrlist);
        //find size or length on arraylist
        System.out.println(arrlist.size());
        
        // remove,access,update,exists
        
        arrlist.remove(0);
        System.out.println(arrlist.get(0));
        
        arrlist.set(0,100);
        System.out.println(arrlist);
        System.out.println(arrlist.contains(95));
        System.out.println(arrlist.indexOf(95));
        
        arrlist.clear();
        // traversing or iterating over arraylist --> for each
        
        for (int arr :arrlist){
            System.out.println(arr);
            
        }
        // Iterator --> iterate
        
        Iterator<Integer> itr= arrlist.iterator();
        
        while(itr.hasNext()){
            int marks = itr.next();
            System.out.println(marks);
        }
    }
}