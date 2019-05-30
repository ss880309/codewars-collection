import java.util.*;
public class FindOdd {
  public static int findIt(int[] a) {
    Arrays.sort(a);
    
    int count = 1;
    int prev = a[0];
    for(int i=1;i<a.length;i++)
    {
        if(prev==a[i]){
            count++;
        }
        else{
          if(count%2!=0){
              break;
          }
          else{
              count=1;
              prev=a[i];
          }       
        }        
    }
    
    return prev;
  }
}