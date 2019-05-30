import java.util.*;
public class Kata {
  public static int[] sortArray(int[] array) {
  
    int[] result = new int[array.length];
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<result.length;i++){
      if(array[i]%2==0){
        result[i] = array[i];
      }else{
        list.add(array[i]);
        result[i] = -1;
      }
    }
    Collections.sort(list);
    for(int i=0,j=0;i<result.length;i++){
      if(result[i]==-1){
        result[i] = list.get(j);
        j++;
      }
    
    }
  
  
    return result;
  }
}