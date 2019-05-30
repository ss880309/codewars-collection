import java.util.*;
public class Xbonacci {

  public double[] xbonacci(double[] signature, int s) {
      // hackonacci me
      System.out.println(Arrays.toString(signature)+" "+s);

      double[] n = new double[s];
      int size = signature.length;
      for(int i=0;i<Math.min(s,signature.length);i++)
      {
        n[i] = signature[i];
      }
      
      if(s<signature.length)  return n;
      
      for(int i=signature.length;i<s;i++)
      {
        for(int j=1;j<=size;j++)
        {
            n[i] += n[i-j];
        }
      }
      System.out.println(Arrays.toString(signature)+" "+s);
      System.out.println(Arrays.toString(n));
      
      return n;
      
  }
}