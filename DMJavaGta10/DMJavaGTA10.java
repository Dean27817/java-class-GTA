import java.io.*;
import java.util.Scanner;
public class DMJavaGTA10 
{
    public void part1(File mainText) 
    {
    System.out.println("the file name is " + mainText.getName());
    System.out.println("the file path is " + mainText.getAbsolutePath());
    System.out.println("can we read this file? " + mainText.canRead());
    System.out.println("can we write this file?" + mainText.canWrite());
    System.out.println("the file length is " + mainText.length());
    System.out.println("the last time this file was edited was " + mainText.lastModified());
    }
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
    public void readOne(File mainText) throws FileNotFoundException{
		Scanner fileRead = new Scanner(mainText);
        System.out.println("the first token is " + fileRead.next());
        System.out.println("the first line after that token is " + fileRead.nextLine());
		fileRead.close();

    }
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
	public void writeLine(PrintWriter writeFile, String hello)
	{
		writeFile.println(hello);
	}
    public void fileWriting(PrintWriter writeFile, String hello) 
    {
        writeFile.print(hello);
    }
    public void filePrintF(PrintWriter writeFile, String hello) 
    {
        writeFile.printf("%nthe string that was put in was %S", hello);
    }
}