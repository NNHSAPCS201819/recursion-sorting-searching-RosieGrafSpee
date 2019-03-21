import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = null;
      if (n <= 0)  // The smallest list we can make
      {
          tempList = new ArrayList<Integer>();
      }
      else        // All other size lists are created here
      {
          tempList = makeList(n - 1);
          tempList.add(n);
      }
      return tempList;
   }
}