import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      // Just Smile :)
      List<String> t = new ArrayList(Arrays.asList(new String[]{":-)",":-D",":~)",":~D",";-)",";-D",";~)",";~D",":)",";)",":D",";D"}));
      int count = 0;
      for(int i=0;i<arr.size();i++)
      {
          if(t.contains(arr.get(i)))
            count++;
      }      
      return count;
  }
}