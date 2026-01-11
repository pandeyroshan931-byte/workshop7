package Workshop10;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class ExamApp {
    public static void main(String[] args) {
        ScienceStudent s = new ScienceStudent(1, "Amit", 38);
        System.out.println(s);
        System.out.println("Result: " + s.calculateResult(5));
    }
}