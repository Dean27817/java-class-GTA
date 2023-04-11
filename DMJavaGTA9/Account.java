public class Account 
{
    String name;
    int accountNum;
    double balance;

    public void setAccount(String userName, int userNum, double money)
    {
        name = userName;
        accountNum = userNum;
        balance = money;
    }

    public void setBalance(double money) 
    {
        this.balance = money;    
    }

    public String getName() 
    {
        return this.name;
    }
    public int getAccountNum()
    {
        return this.accountNum;
    }
    public double getBalance()
    {
        return this.balance;
    }

    public String toString() 
    {
        return String.format("the user %s at account number %d has a balance of %f", this.name, this.accountNum, this.balance);
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