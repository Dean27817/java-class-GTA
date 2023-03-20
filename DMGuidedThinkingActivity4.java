//Author: Dean Morgan
//Date: 2/15/2023
//Class CSC1060-601
//Activity: Guided Thinking Lab 4
//this will be a program to determine the height of a tree by getting the hypotenuse and angle of a tree triangle
public class DMGuidedThinkingActivity4 {

	public static void main(String[] args) {
		String message = "trigonometry makes calculating heights easy!";
		System.out.println(message);
		System.out.println("the leingth of the privious message was " + message.length() + " letters!");
		int spaceIndex = message.indexOf(' ');
		System.out.println("the first word of that message was " + message.substring(0, spaceIndex));
		char firstLetter = message.charAt(0)
;		System.out.println("the first letter of that message was " + firstLetter);
		char firstLetterCap = Character.toUpperCase(firstLetter);
		System.out.println("that letter in caps is " + firstLetterCap);
		System.out.println("-------------------------------------------------------------------------------------");
		double degrees = 70;
		double hypotonuse = 15.71;
		System.out.println("the initial degrees of the angle of the triangle is " + degrees + " degrees");
		System.out.println("the initial length of the hypotonuse is " + hypotonuse + " units");
		double angleRadians = Math.toRadians(degrees);
		System.out.println("the angle in radians is " + angleRadians);
		double sinOfRadians = Math.sin(angleRadians);
		System.out.println("the sin of the angle in radians is " + sinOfRadians);
		double opposite = hypotonuse * sinOfRadians;
		System.out.println("the leingth of the oposite side is " + opposite);
		double root = Math.sqrt(opposite);
		System.out.println("the square root of the opposite side is " + root);
		
	}

}
