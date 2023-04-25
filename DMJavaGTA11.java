import java.io.*;

/*Author: dean morgan
 * date: 4/25/2023
 * class: csc 160
 * assignment 
 * this program will teach about java exeptions, as well as reenforcing my knowlage of file io
 *  
 */
class DMJavaGTA11 {


    /*  Author:	Dean Morgan
**  Date:	4/25/2023
**  Description:	will write a predetermined string to the passed file and throwes an exeption if the string is null
**  Parameters:	mainText(File)
**  Calling method:	main
**  Return values:   none
*/
    public static void writeToFile(File mainText) throws IOException{
        String toFile = "";
        if (toFile == "")
        {
            throw new IllegalArgumentException("will not write to file");
        }
        else
        {
            try 
            {
                PrintWriter write = new PrintWriter(mainText);
                System.out.println("writer opened");
                write.println(toFile);
                write.close();
            } 
            catch (Exception ex) 
            {
                System.out.println("error opening file for writing");
            }
            finally
            {
                System.out.println("file opened and written");
            }
        }
    }
    public static void main(String[] args) throws Exception{
        File mainText = null;
        try
        {
            mainText = new File("mainText.txt");
            mainText.createNewFile();
            System.out.println("file created and set up");
        }
        catch (Exception ex)
        {
            System.out.println("error creating or setting up main text file");
        }
        finally
        {
            System.out.println("file creation compleate");
        }
        writeToFile(mainText);
    }
    
}