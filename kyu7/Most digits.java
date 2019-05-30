import java.util.*;
public class MostDigits {
  public static int findLongest(int[] numbers) {
      
      //Arrays.sort(numbers);
      int size = 0;
      for(int i=0;i<numbers.length;i++)
      {
          if(numbers[i]>0)
            size = Math.max(size,Integer.toString(numbers[i]).length());
          else
            size = Math.max(size,Integer.toString(numbers[i]).length()-1);
      }
      int ans = 0;
      for(int i=0;i<numbers.length;i++)
      {
          if(numbers[i]>0)
          {
            if(Integer.toString(numbers[i]).length()==size)
            {
                
                ans = numbers[i];
                break;
            }
          }else{
            if(Integer.toString(numbers[i]).length()-1==size)
            {
                
                ans = numbers[i];
                break;
            }
          }
      }
       
      return ans;
  }
}