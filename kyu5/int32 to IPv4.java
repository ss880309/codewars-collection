import java.util.*;
public class Kata {
  public static String longToIP(long ip) {
    // Java doesn't have uint32, so here we use long to represent int32
    long[] n = new long[4];
    for(int i=1;i<=4;i++)
    {      
        n[i-1] = (long)((double)ip % 256);
        ip = (long)((double)ip / 256  ); 
    }
    
    System.out.println(Arrays.toString(n));

    return n[3]+"."+n[2]+"."+n[1]+"."+n[0]; // do it!
  }
}