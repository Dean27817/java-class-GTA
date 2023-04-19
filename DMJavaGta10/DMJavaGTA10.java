/*Author: dean morgan
 * date: 4/19/2023
 * class: csc 160
 * assignment 
 * this will work in tandom witht the driver program to help further understanding of working with file input and output
 *  it will do this by reading text from the mainText.txt file and writing text to the writeText.txt file
 */


import java.io.*;
import java.util.Scanner;
public class DMJavaGTA10 
{

    /*  Author:	Dean Morgan
**  Date:	4/19/2023
**  Description:	prints different things about the file "mainText.txt"
**  Parameters:	mainText(File)
**  Calling method:	DMJavaGTA10.main()
**  Return values:   none
*/

    public void part1(File mainText) 
    {
    System.out.println("the file name is " + mainText.getName());
    System.out.println("the file path is " + mainText.getAbsolutePath());
    System.out.println("can we read this file? " + mainText.canRead());
    System.out.println("can we write this file?" + mainText.canWrite());
    System.out.println("the file length is " + mainText.length());
    System.out.println("the last time this file was edited was " + mainText.lastModified());
    }

    /*  Author:	Dean Morgan
**  Date:	4/19/2023
**  Description:	will validate that the file passed was found
**  Parameters:	mainText(File)
**  Calling method:	DMJavaGTA10.main()
**  Return values:   boolean
*/
    public boolean foundFile(File mainText) 
    {
        if(mainText.exists())
        {
            System.out.println("file found");
            return true;
        }
        else
        {
            System.out.println("file not found");
            return false;
        }
    }

    /*  Author:	Dean Morgan
**  Date:	4/19/2023
**  Description:	reads the first token and the first line of the passed file
**  Parameters:	mainText(File)
**  Calling method:	DMJavaGTA10.main()
**  Return values:   none
*/
    public void readOne(File mainText) throws FileNotFoundException{
		Scanner fileRead = new Scanner(mainText);
        System.out.println("the first token is " + fileRead.next());
        System.out.println("the first line after that token is " + fileRead.nextLine());
		fileRead.close();

    }

    /*  Author:	Dean Morgan
**  Date:	4/19/2023
**  Description:	prints the contents of the passed file one token at a time
**  Parameters:	mainText(File)
**  Calling method:	DMJavaGTA10.main()
**  Return values:   none
*/
    public void oneAtATime(File mainText) throws FileNotFoundException{
		Scanner fileRead = new Scanner(mainText);
		int count = 0;
		while(fileRead.hasNext())
		{
			System.out.println("token " + count + " is " + fileRead.next());
			count++;
		}
		fileRead.close();
    }
    /*  Author:	Dean Morgan
**  Date:	4/19/2023
**  Description:	reads the passed file one line at a time
**  Parameters:	mainText(File)
**  Calling method:	DMJavaGTA10.main()
**  Return values:   none
*/
	public void oneLineAtATime(File mainText) throws FileNotFoundException{
		Scanner fileRead = new Scanner(mainText);
		int count = 0;
		while(fileRead.hasNextLine())
		{
		System.out.println("line " + count + " is " + fileRead.nextLine());
		count++;
		}
		fileRead.close();
	}

    /*  Author:	Dean Morgan
**  Date:	4/19/2023
**  Description:	prints the word hello on the first line as the passed file
**  Parameters:	writeFile(printWriter) hello (string)
**  Calling method:	DMJavaGTA10.main()
**  Return values:   none
*/
	public void writeLine(PrintWriter writeFile, String hello)
	{
		writeFile.println(hello);
	}
    /*  Author:	Dean Morgan
**  Date:	4/19/2023
**  Description:	prints the input to a file
**  Parameters:	writeFile(printWriter) hello(string)
**  Calling method:	DMJavaGTA10.main()
**  Return values:   none
*/
    public void fileWriting(PrintWriter writeFile, String hello) 
    {
        writeFile.print(hello);
    }
    /*  Author:	Dean Morgan
**  Date:	4/19/2023
**  Description:	prints the passed string, but formatted
**  Parameters:	writeFile(printWriter) mainText(File)
**  Calling method:	DMJavaGTA10.main()
**  Return values:   none
*/
    public void filePrintF(PrintWriter writeFile, String hello) 
    {
        writeFile.printf("%nthe string that was put in was %S", hello);
    }
}