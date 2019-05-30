import java.util.*;
public class Kata {
  public static String findNeedle(Object[] haystack) {
    // Your code here
    //System.out.println(Arrays.toString(haystack));
    int i = 0;
    for(i=0;i<haystack.length;i++)
    {
        if(haystack[i]==null)
          continue;
        if((haystack[i].toString()).equals("needle"))
            break;
    }
    
    //System.out.println("found the needle at position "+i);
    return ("found the needle at position "+i);
    
  }
}