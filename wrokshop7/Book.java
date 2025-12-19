package wrokshop7;


/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    String title;
    String author;
    double price;
    
    void display() {
        System.out.println("Title   " + title);
        System.out.println("Author  " + author);
        System.out.println("Price   " + price);
        System.out.println();
    }
}