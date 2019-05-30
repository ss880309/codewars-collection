public class Solution {
  public static int zeros(int n) {
      int count = 0;
      for(int i=n/5;i>=1;i/=5)  
        count+=i;    
      return count;
  }
}