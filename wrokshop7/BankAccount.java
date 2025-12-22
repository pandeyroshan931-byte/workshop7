package wrokshop7;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int accountNumber;
    String holderName;
    double balance;
    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void display() {
        System.out.println("accountNumber" +accountNumber);
         System.out.println("holderName" +holderName);
          System.out.println("balance" +balance);
    }
}