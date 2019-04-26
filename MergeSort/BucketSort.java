import java.util.Random;
/**
 * Write a description of class BucketSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BucketSort
{
    /**
     * Constructor for objects of class BucketSort
     */
    private static String randomString(int numChars)
    {
        char[] res = new char[numChars];
        Random a = new Random();
        
        for (int i = 0; i < numChars; i++)
        {
            res[i] = (char)(a.nextInt(26) + 'a');
        }
        
        return new String(res);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
