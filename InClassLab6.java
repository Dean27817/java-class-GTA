import java.time.LocalDate;
import java.util.Scanner;

/*Author: Dean Morgan
 * date: 3/20/2023
 * class: csc 160
 * assignment homework java GTA 6
 * 
 *  this will be a program that will play around with creating my own functions, as well as using premade date and time functions
 */
public class InClassLab6 {

	/*  Author:	Dean Morgan
**  Date:	3/20/2023
**  Description:	this will determine if the current year is a leap year
**  Parameters:	year(int)
**  Calling method:	main
**  Return values:   leapYear(boolean)
*/

	public static boolean isLeapYear(int year)
	{
		boolean leapYear = year % 4 == 0;
		return leapYear;
	}

	/*  Author:	Dean Morgan
**  Date:	3/20/2023
**  Description:	this will determine if the year inputed is a century
**  Parameters:	year(int)
**  Calling method:	main
**  Return values:   centuryYear(boolean)
*/

	public static boolean isCentury (int year)
	{
		boolean centuryYear = year % 400 == 0;
		return centuryYear;
	}

	/*  Author:	Dean Morgan
**  Date:	3/20/2023
**  Description:	this will determine if someones birthday is at the current date
**  Parameters:	birthday(int) birthMonth(int) currentDay(int) currentMonth(int)
**  Calling method:	main
**  Return values:   none
*/

	public static void isBirthday(int birthday, int birthMonth, int currentDay, int currentMonth)
	{
		if(birthday == currentDay && birthMonth == currentMonth)
		{
			System.out.println("happy birthday!");
		}
		else
		{
			System.out.println("it is not your birthday today");
		}
	}

	/*  Author:	Dean Morgan
**  Date:	3/20/2023
**  Description:	this will print the current date
**  Parameters:	currentDate(LocalDate object)
**  Calling method:	main
**  Return values:   none
*/

	public static void printDate(LocalDate currentDate)
	{
		System.out.println("the current date is " + currentDate);
	}

	/*  Author:	Dean Morgan
**  Date:	3/20/2023
**  Description:	this will print the month and year
**  Parameters:	currentMonth(int) currentYear(int)
**  Calling method:	main
**  Return values:   none
*/

	public static void printDate(int currentMonth, int currentYear)
	{
		System.out.println("the month is " + currentMonth + " the current year is " + currentYear);
	}
	
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		LocalDate currentDate = LocalDate.now();
		System.out.println("the current date is " + currentDate);

		int currentYear = currentDate.getYear();
		System.out.println("the current year is " + currentYear);

		int currentMonth = currentDate.getMonthValue();
		System.out.println("the current month is " + currentMonth);

		int currentDay = currentDate.getDayOfMonth();
		System.out.println("the current day is " + currentDay);

		boolean leap = isLeapYear(currentYear);
		System.out.println("this year is a leap year is " + leap);

		boolean century = isCentury(currentYear);
		System.out.println("this year is a century year is " + century);

		System.out.println("what is your birth day (2 digits) in the form of a number");
		int birthday = scnr.nextInt();
		System.out.println("what is your birth month (2 digits) in the form of a number");
		int birthMonth = scnr.nextInt();
		System.out.println("what is your birth year (4 digits) in the form of a number");
		int birthYear = scnr.nextInt();

		boolean birthCentury = isCentury(birthYear);
		System.out.println("your birth year is a century year is " + birthCentury);

		isBirthday(birthday, birthMonth, currentDay, currentMonth);

		printDate(currentDate);
		printDate(currentMonth, currentYear);

		char agein = 'y';
		while (agein == 'y' || agein == 'Y')
		{
			System.out.println("what year would you like to test if it is a century year");
			century = isCentury(scnr.nextInt());
			System.out.println("this year is a century year is " + century);
			System.out.println("would you like to go agein");
			agein = scnr.next().charAt(0);
		}
		scnr.close();
	}

}
