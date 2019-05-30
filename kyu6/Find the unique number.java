import java.util.*;

 public class Kata {
    public static double findUniq(double arr[]) {
      // Do the magic
      Arrays.sort(arr);
      if(arr[0]!=arr[1] && arr[arr.length-2]==arr[arr.length-1])
        return arr[0];
      else
        return arr[arr.length-1];
    }
}