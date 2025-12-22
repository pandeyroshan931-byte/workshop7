package Scenario;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args){
         BankAccount ba1 = new BankAccount();
        ba1.accountNumber = 101;
        ba1.holderName = "Hari";
        ba1.balance = 5000;
        ba1.deposit(1000);
        ba1.withdraw(500);
        ba1.display();
        BankAccount ba2 = new BankAccount();
        ba2.accountNumber = 102;
        ba2.holderName = "ram";
        ba2.balance = 8000;
        ba2.deposit(2000);
        ba2.withdraw(1000);
        ba2.display();
    }
        
}