//Author: Dean Morgan
//Date: 2/15/2023
//Class CSC1060-601
//Activity: Guided Thinking Lab Debug
//this will be a program that will prompt the user to enter a number 1-12 and will give them the month of that number


import java.util.Scanner;

/* You probably just saw this code in your Guided Thinking Activity there is a logic error with it.
*  use the debugger to figure what the problem is.  What do you think it is?
*  
*  In addition, fix the syntax errors before entering the debugger.
*
*/
public class DMGuidedThinkingActivityDebug
{

	public static void main( String[ ] args )
	{
		 Scanner input = new Scanner(System.in);
		 
		 
		 System.out.println("Enter a number from 1 to 12");
		 int num = input.nextInt();
			
		 if(num > 0 && num <= 12)
		 {
				switch(num) 
				{
				case 1: System.out.println("Month is Jan");
							break;
				case 2: System.out.println("Month is Feb");
							break;
				case 3: System.out.println("Month is Mar");
							break;
				case 4: System.out.println("Month is Apr");
				  			break;
				case 5: System.out.println("Month is May");
				  			break;
				case 6: System.out.println("Month is June");
		  		  			break;
				case 7: System.out.println("Month is July");
		  					break;
				case 8: System.out.println("Month is August");
		  					break;
				case 9: System.out.println("Month is Sept");
		  					break;
				case 10: System.out.println("Month is Oct");
		  					break;
				case 11: System.out.println("Month is Nov");
		  					break;
				case 12: System.out.println("Month is Dec");
		  					break;
				};
		
		 }
		 else
		 {
			 System.out.println("Wrong entry");
		 }
		 input.close();
	}
	
}
