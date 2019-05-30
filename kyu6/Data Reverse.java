import java.util.*;
public class Kata {
  public static int[] DataReverse(int[] data) {
      int[] n = new int[data.length];
      for(int i=data.length-8,ni=0;i>=0;i-=8)
      {
          for(int j=0;j<8;j++)
          {
            n[ni++] = data[i+j];  
          }
          //n[(n.length-1) - i] = data[i];
          
      }
      System.out.println(Arrays.toString(data));
      System.out.println(Arrays.toString(n));
      
      return n;
  }
}