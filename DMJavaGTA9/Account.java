import java.util.Scanner;

public class Account 
{
    String name;
    int accountNum;
    double balance;

    public void account(String userName, int userNum, double money)
    {
        name = userName;
        accountNum = userNum;
        balance = money;
    }

    public void setBalance(double money) 
    {
        balance = money;    
    }

    public String name() {
        return name;
    }

    public String returnInfo() 
    {
        return "the useer " + this.name + " at account number " + this.accountNum + " has a balance of " + this.balance;
    }
    public void deposit(double money) 
    {
        
        if (money > 0)
        {
            this.balance += money;
            System.out.println("deposit approved");
        }
        else
        {
            System.out.println("ammount must be positive");
        }
    }
    public int withdraw(double withdraw)
    {
        if (withdraw <= this.balance)
        {
            this.balance -= withdraw;
            System.out.println("withdraw succesful. you now have $" + this.balance);
            return 1;
        }
        else
        {
            System.out.println("insufficient funds");
        }
        return -1;
    }

}