import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
  
    String temp = Integer.toString(num);
    int[] digit = new int[temp.length()];
    for(int i=0;i<digit.length;i++)
      digit[i] = temp.charAt(i)-'0';
    Arrays.sort(digit);
  
    StringBuilder result = new StringBuilder("");
    for(int i=0;i<digit.length;i++)
      result.append(digit[i]);
    return Integer.parseInt(result.reverse().toString());

  }
}