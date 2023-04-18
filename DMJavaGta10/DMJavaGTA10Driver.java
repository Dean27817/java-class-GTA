import java.io.*;
public class DMJavaGTA10Driver 
{
    public static void main(String[] args) throws FileNotFoundException{
        File mainText = new File("mainText.txt");
        File forWriting = new File("writeText.txt");
        DMJavaGTA10 basicFunctions = new DMJavaGTA10();
        PrintWriter writeFile = new PrintWriter(forWriting);
        if (basicFunctions.foundFile(mainText) && basicFunctions.foundFile(forWriting))
        {
            basicFunctions.part1(mainText);
            basicFunctions.readOne(mainText);
            basicFunctions.oneAtATime(mainText);
            basicFunctions.oneLineAtATime(mainText);
            System.out.println("file reading is complete");
            basicFunctions.writeLine(writeFile, "hello World");
            basicFunctions.fileWriting(writeFile, "good");
            basicFunctions.filePrintF(writeFile, "It works");
            System.out.println("writing is complete");
        }
        writeFile.close();
    }
}