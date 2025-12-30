package workshop8;
import java.util.Scanner;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int accountNumber;
    private double balance;
    private String name;
    private double amount;
    Scanner sc=new Scanner(System.in);
   
    public BankAccount(int accountNumber,double balance, String name,double amount)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
        this.amount=amount;
    }
    double getbalance()
    {
        return balance;
    }
    void deposit()
    {
        System.out.println("Enter the amount you want to deposit");
        amount=sc.nextDouble();
        balance=balance+amount;
    }
    boolean withdraw()
    {
       System.out.println("Enter how much ammount you want to withdrawl");
       double wdamount=sc.nextDouble();
       if(wdamount<= balance)
       {
           return true;
       }
       else
       {
           return false;
       }
    }
}