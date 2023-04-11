/*Author: dean morgan
 * date: 4/11/2023
 * class: csc 160
 * assignment 
 * this will be a secondary program that, in tandom with the driver program, will be a basic banking system
 *  
 */

public class Account 
{
    String name;
    int accountNum;
    double balance;

/*  Author:	Dean Morgan
**  Date:	4/11/2023
**  Description:	sets all of the account variables to the peramiters enterd
**  Parameters:	userName(string), userNum(int), money(double)
**  Calling method:	driver.main
**  Return values:   none
*/

    public void setAccount(String userName, int userNum, double money)
    {
        name = userName;
        accountNum = userNum;
        balance = money;
    }

/*  Author:	Dean Morgan
**  Date:	4/11/2023
**  Description:	sets the balance variable to the peramiter entered
**  Parameters:	money(double)
**  Calling method:	driver.main
**  Return values:   none
*/

    public void setBalance(double money) 
    {
        this.balance = money;    
    }

/*  Author:	Dean Morgan
**  Date:	4/11/2023
**  Description:	gets the name vcariable and returns it to the main program
**  Parameters:	none
**  Calling method:	driver.main
**  Return values:   name(String)
*/

    public String getName() 
    {
        return this.name;
    }

/*  Author:	Dean Morgan
**  Date:	4/11/2023
**  Description:	returns the accountNum variable to the main function
**  Parameters:	none
**  Calling method:	driver.main
**  Return values:   accountNum(int)
*/

    public int getAccountNum()
    {
        return this.accountNum;
    }

/*  Author:	Dean Morgan
**  Date:	4/11/2023
**  Description:	returns the balance variable to the main program
**  Parameters:	none
**  Calling method:	driver.main
**  Return values:   balance(double)
*/

    public double getBalance()
    {
        return this.balance;
    }

/*  Author:	Dean Morgan
**  Date:	4/11/2023
**  Description:	returnes all data to the main program in the form of a formatted string
**  Parameters:	none
**  Calling method:	driver.main
**  Return values:   "the user %s at account number %d has a balance of %f"(string), name(String), accountNum(int), balance(double)
*/

    public String toString() 
    {
        return String.format("the user %s at account number %d has a balance of %f", this.name, this.accountNum, this.balance);
    }

/*  Author:	Dean Morgan
**  Date:	4/11/2023
**  Description:	allowes the user to add the money peramiter to the total balance
**  Parameters:	money(double)
**  Calling method:	driver.main
**  Return values:   none
*/
    
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

/*  Author:	Dean Morgan
**  Date:	4/11/2023
**  Description:	allowes the user to subtract the peramiter from the total balance
**  Parameters:	withdraw (double)
**  Calling method:	driver.main
**  Return values:   1 or -1
*/

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