import java.util.*;
public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
      // hackonacci me
      //if(n<s.length)  return new double[]{0};
      System.out.println(Arrays.toString(s)+" "+n);
      double[] t = new double[n];
      for(int i=0;i<Math.min(s.length,n);i++)
        t[i] = s[i];
      
      for(int i=3;i<t.length;i++){
          t[i] = t[i-1]+t[i-2]+t[i-3];
      }
      return t;
      
  }
}