import java.util.*;
public class PerfectPower {
  static List<Double> list = null;
  static List<int[]> note = null;
  public static int[] isPerfectPower(int n) {
    // ...
    if(n<4) return null;
    
    int M=0;
    int K=0;
    int find = 0;
    int[] ans = null;
    
    if(list==null)
    {
      list = new ArrayList();
      note = new ArrayList();
      for(int m=2;m<=1000;m++)
      {
        for(int k=2;k<=10;k++)
        {
            double t = Math.pow(m,k);
            list.add(t);
            note.add(new int[]{m,k});
        }
      }
    }
    
    //System.out.println(list);
    
    if(list.contains((double)n)){
      System.out.println(n);
      return note.get(list.indexOf((double)n));
    }
    else
      return null;
    
  }
}