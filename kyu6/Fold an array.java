import java.util.*;
public class Kata
{
  public static int[] fold(int[] array,int size)
  {
      int mid;
      int[] folded;
      
      if(size%2!=0)
      {
        
        mid = size/2;
        folded = new int[mid+1];
        folded[mid] = array[mid];
        for(int i=0;i<mid;i++){
            folded[i] = array[i] + array[array.length -1 - i];
        }
        return folded;
        
      }else{
      
        mid = size/2;
        folded = new int[array.length/2];
        for(int i=0;i<folded.length;i++){
            folded[i] = array[i] + array[array.length -1 - i];
        }
        return folded;
      } 
  }
  
  
  
  public static int[] foldArray(int[] array, int runs)
  {
    System.out.println(Arrays.toString(array)+" "+runs);
    int[] ans = array;
    
    for(int i=0;i<runs;i++)
      ans = fold(ans,ans.length);
      
    return ans;
  }
}
