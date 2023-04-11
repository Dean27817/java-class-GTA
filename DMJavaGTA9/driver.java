/*Author: dean morgan
 * date: 4/11/2023
 * class: csc 160
 * assignment 
 * this will be a driver program that, in tandom with the account program, will be a basic banking system
 *  
 */

import java.util.Scanner;

public class driver {

/*  Author:	Dean Morgan
**  Date:	4/11/2023
**  Description:	takes the choice variable from the main function and calles the function from the Account class to tell the users what to do
**  Parameters:	choice(int), dean(account object), scnr(Scanne4r object)
**  Calling method:	main
**  Return values:   none
*/

    public static void accessAccount(int choice, Account dean, Scanner scnr) 
    {
        double moneyNum;
        int validWithdraw = -1;
        switch (choice)
        {
            case 1:
            while (validWithdraw == -1)
            {
                System.out.println("how much money would you like to withdraw");
                moneyNum = scnr.nextDouble();
                validWithdraw = dean.withdraw(moneyNum);
            }
            System.out.println("withdraw compleated");
            break;

            case 2:
            System.out.println("how much money would you like to deposit");
            moneyNum = scnr.nextDouble();
            dean.deposit(moneyNum);
            break;

            case 3:
            System.out.println("what would you like to set the balance to");
            moneyNum = scnr.nextDouble();
            dean.setBalance(moneyNum);
            break;

            case 4:
            System.out.println("what portion of the account would you like to see \n(1) name \n(2) account number \n(3) balance \n(4) everything");
            choice = scnr.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println(dean.getName());
                break;
                case 2:
                System.out.println(dean.getAccountNum());
                break;
                case 3:
                System.out.println(dean.getBalance());
                break;
                case 4:
                System.out.println(dean.toString());
                break;
                default:
                System.out.println("invalid choice");
                break;
            };

            break;
            default:
            System.out.println("invalid choice");
        };
    }
    public static void main(String[] args) 
    {
        Scanner scnr = new Scanner(System.in);
        Account dean = new Account();
        int accountNum;
        int choice;
        double money;
        char agein = 'y';
        String name;
        System.out.println("what is your account number");
        accountNum = scnr.nextInt();
        System.out.println("what is your name");
        name = scnr.next();
        System.out.println("how much money is in your account");
        money = scnr.nextInt();
        dean.setAccount(name, accountNum, money);
        while(agein == 'y')
        {
            System.out.println("would you like to 1, withdraw money from the account, 2, deposit money into the account, 3, reset acount balance,  or 4, see account info");
            choice = scnr.nextInt();
            accessAccount(choice, dean, scnr);
            System.out.println("would you like to do another action");
            agein = scnr.next().charAt(0);
        }
        System.out.println("thank you! \nCome again!");

    }
}
