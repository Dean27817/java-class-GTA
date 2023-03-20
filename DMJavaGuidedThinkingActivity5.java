//Author: Dean Morgan
//Date: 2/15/2023
//Class CSC1060-601
//Activity: Guided Thinking Lab 4
//This program is designed to fulfill the requirements of the java thinking activity 5 assignment

import java.util.Scanner;

public class DMJavaGuidedThinkingActivity5 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double dogPrice = 5.95;
		int dogNum = 4;
		int count = 0;
		int total = 0;
		
		while (dogNum >= 1)
		{
			System.out.println("you got " + dogNum + " hotdogs");
			total += dogNum;
			dogNum--;
			count++;
		}
		System.out.println("your total number of hotdogs was " + total);
		System.out.println("you looped " + count + " times");
		double averageDog = (double)(total)/(double)(count);
		System.out.println("the average number of hotdogs orderd was " + averageDog);
		System.out.println("the price was " + total * dogPrice);
		
		///////////////////////////////////////////////////////////////////////////////////////////Assignment using a while loop
		
		dogNum = 4;
		count = 0;
		total = 0;
		
		do
		{
			System.out.println("you got " + dogNum + " hotdogs");
			total += dogNum;
			dogNum--;
			count++;
		}while (dogNum >= 1);
		System.out.println("your total number of hotdogs was " + total);
		System.out.println("you looped " + count + " times");
		averageDog = (double)(total)/(double)(count);
		System.out.println("the average number of hotdogs orderd was " + averageDog);
		System.out.println("the price was " + total * dogPrice);
		
///////////////////////////////////////////////////////////////////////////////////////////Assignment using a do while loop
		
		dogNum = 4;
		count = 0;
		total = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("you got " + dogNum + " hotdogs");
			total += dogNum;
			dogNum--;
			count++;
		}
		System.out.println("your total number of hotdogs was " + total);
		System.out.println("you looped " + count + " times");
		averageDog = (double)(total)/(double)(count);
		System.out.println("the average number of hotdogs orderd was " + averageDog);
		System.out.println("the price was " + total * dogPrice);
		
///////////////////////////////////////////////////////////////////////////////////////////Assignment using a for loop
		
		dogNum = 4;
		count = 0;
		total = 0;
		
		System.out.println("how many hotdogs would you like");
		dogNum = scnr.nextInt();
		
		do
		{
			System.out.println("you got " + dogNum + " hotdogs");
			total += dogNum;
			dogNum--;
			count++;
			System.out.println("how many more hotdogs would you like");
			dogNum = scnr.nextInt();
		}while (dogNum >= 1);
		System.out.println("your total number of hotdogs was " + total);
		System.out.println("you looped " + count + " times");
		averageDog = (double)(total)/(double)(count);
		System.out.println("the average number of hotdogs orderd was " + averageDog);
		System.out.println("the price was " + total * dogPrice);
		
///////////////////////////////////////////////////////////////////////////////////////////adding user input
		
		scnr.close();
	}

}
