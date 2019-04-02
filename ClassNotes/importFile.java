import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class importFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class importFile
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class importFile
     */
    public importFile()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean palindrome(String a)
    {
        for (int i = 0; i < a.length() / 2; i++)
        {
            if(a.charAt(i) != a.charAt(a.length() - (i + 1)))
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        String str = "", fileName = "palindrome.txt";
        File inputFile = new File(fileName);
        
        Scanner s = new Scanner(inputFile);
        s.useDelimiter("[A-Za-z] + ");
        
        for(; s.hasNext();)
        {
            str += s.next();
        }
        
        System.out.println(palindrome(str));
        s.close();
    }
}
