/*Author: dean morgan
 * date: 1/30/2023
 * class: csc 160
 * assignment HW1
 * 
 * this is a program that is made to fulfill the requirements for the second in class lab.
 * these requirements include, but are not limited to, calculating the radius of a circle, declaring multiple variables, and doing some basic math.
 */

import java.util.Scanner;

public class DeanMorganLab2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// this is the start of the identifiers question set
		int intVar;
		// Q1
		intVar = 5;
		System.out.println(intVar);
		// Q2
		double dblVar;
		// Q3
		dblVar = 5.5;
		System.out.println(dblVar);
		// Q4
		String fooBar = "foo bar";
		// Q5
		System.out.println(fooBar);
		// I just did the print statement because I don't like to have things underlined
		final double FOREVER = 0.10;
		// Q6
		System.out.println((intVar + dblVar) * FOREVER);
		// Q7 && Q8
		// this is the end of the identifiers section and the beginning f the order of operations section
		double orderOfOperationsStepOne = (3 + 5) / 2 * 4 % 5;
		// Q1
		System.out.println(orderOfOperationsStepOne);
		// Q2
		int x = 2;
		int y = 5;
		x += y;
		System.out.println(x);
		// Q3
		// this is the end of the order of operations section and the beginning of the increment & decrement section
		int incrementThis = 0;
		for (int i = 30; i>0; i--)
		{
			incrementThis++;
			System.out.println(incrementThis);
		}
		// Q1
		for (int i = 30; i>0; i--)
		{
			incrementThis--;
			System.out.println(incrementThis);
		}
		// Q2
		// this is the end of the increment and decrement section and the beginning of the math.pi section
		final double PI = Math.PI;
		// q1
		System.out.print("input the radius of a circle: ");
		double radius = input.nextDouble();
		double answer = radius * PI * 2;
		// Q2
		// I added input because I thought it would be more fun and easier for testing
		System.out.println(answer);
		// Q3
		input.close();
	}

}