import java.util.*;
public class Frame {
  public int[][] invertArrayMiddle(int n) {
      
      int[][] ans = new int[n][n];
      int count = 1;
      
      //init
      for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
          ans[j][i] = count++;
      
      //swap
      for(int i=1;i<n-1;i++)
      {
        System.out.println("test");
        for(int j=i;j<n-1;j++)
        {
          int temp = ans[i][j];
          ans[i][j] = ans[j][i];
          ans[j][i] = temp;
        }
      }
      
      return ans;
      
  }
}
