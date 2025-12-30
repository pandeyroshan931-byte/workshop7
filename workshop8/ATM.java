package workshop8;


/**
 * Write a description of class BankAccountTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATM
{
    public static void main(String[] args)
    {
        BankAccount b1 = new BankAccount(1,2000,"Ashimesh",600);
        b1.deposit();
        b1.withdraw();
        double balance=b1.getbalance();
        System.out.println(balance);
       
       
    }
}