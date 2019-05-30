import java.util.*;
import java.util.stream.*;
public class AreSame {  
  public static boolean comp(int[] a, int[] b) { 
    try{
      if(a.length==0 && b.length==0)  return true;
      List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
      int count = 0;
      for(int i=0;i<b.length;i++)
      {
          int n = (int)Math.sqrt(b[i]);
          if(list.contains(n) || list.contains(0-n))
          {
            list.remove(new Integer(n));
            count++;
          }
      }
      return count==b.length;
    }catch(Exception ex){
        return false;
    }
  }
}