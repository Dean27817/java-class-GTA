//Author: Dean Morgan
//Date: 1/25/2023
//Class CSC1060-601
//Activity: Guided Thinking Lab 1
//program shows how to create comments, input, and output in java
// this is stored on the homework folder in my flash drive. it is my first guided thinking lab
//I am currently using dark mode of eclipse
/*
 * public class className{
 * 		public static void main(string[] args){
 * 
 * 		}
 * }
 */
import java.util.Scanner;

public class JavaGTA1 {
	public static void main(String[] args) {
		Scanner flop = new Scanner(System.in);
		System.out.println("guided thinking activity #1 teaches me how to write input and output statements in java");
		System.out.print("what is your faveorite number: ");
		float faveoriteNumber = flop.nextFloat();
		System.out.println("your faveorite number was " + faveoriteNumber);
		flop.close();
	}
}
