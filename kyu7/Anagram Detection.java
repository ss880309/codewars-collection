import java.util.*;
public class Kata {
  public static boolean isAnagram(String test, String original) {
    // your code goes here
    System.out.println(test+" "+original);
    char[] c1 = test.toLowerCase().toCharArray();
    char[] c2 = original.toLowerCase().toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    
    return new String(c1).equals(new String(c2));
  }
}