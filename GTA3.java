
/*Author: dean morgan
 * date: 2/8/2023
 * class: csc 160
 * assignment GTA3
 * This will be an assignment to demonstrate my knowledge of 
 */
import java.util.Scanner;

public class GTA3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("how old are you: ");
		int age = input.nextInt();

		if (age < 18) {
			System.out.println("your age is " + age);
		}
		/////////// Question one

		if (age < 18) {
			System.out.println("you are less than 18 years old");
		} else {
			System.out.println("you are 18 years or older");
		}
		//////////////// question two

		if (age > 40) {
			System.out.println("you are older than 40");

			if (age > 60) {
				System.out.println("you are also older than 60");
			}
		}
		////////////////// question three

		if (age >= 1 && age <= 18) {
			System.out.println("being agile and spry, your age is: " + age);
		} else if (age <= 40) {
			System.out.println("its great to be alive! your age is: " + age);
		} else if (age <= 65) {
			System.out.println("go crazy you can still move! your age is: " + age);
		} else {
			System.out.println("retirement is golden! your age is: " + age);
		}
		//////////////////// question four

		switch (age) {
		case 18:
			System.out.println("you are 18 or under");
			break;
		case 40:
			System.out.println("you are 40 or under");
			break;
		case 65:
			System.out.println("you are 65 or yunger");
			break;
		default:
			System.out.println("you are older than 65");
			break;
		}
		;
		///////////// question five

		System.out.println("input the price of your phone");
		double phonePrice = input.nextInt();

		if (phonePrice >= 400 && phonePrice <= 500) {
			System.out.println("you got the discount!");
			phonePrice *= 0.97;
		} else {
			System.out.println("you didnt get the discount");
		}
		System.out.println("the price of your phone was " + phonePrice);
		//////////// question six

		System.out.println("what is your favorite number");
		int favoriteNumber = input.nextInt();

		if (favoriteNumber > 5 && favoriteNumber < 10) {
			System.out.println("your number is greater than 5 and less than 10");
		}
		////////////////// question seven

		//////////////////////////////////// this section will be for the answers at the
		//////////////////////////////////// bottom of the page

		/*
		 * Q8 age is less than 40, so the first output would fire
		 * 
		 * Q9 if statement (option a)
		 * 
		 * Q10 switch statement
		 * 
		 * Q11 and operator (&&)
		 * 
		 * Q12 or operator (||)
		 * 
		 * Q13 not (!)
		 * 
		 * Q14 exclusive or (^)
		 */

		input.close();

	}

}
