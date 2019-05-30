 import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        String[] t = s.split(" ");
        int min = Integer.MAX_VALUE;
        for(int i=0;i<t.length;i++)
          min = Math.min(min,t[i].length());
        return min;
        
    }
}