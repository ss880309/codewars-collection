import java.util.*;
import java.util.stream.*;
public class EnoughIsEnough {

  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    if(elements.length==0)  return new int[]{};
    int max = Collections.max(Arrays.stream(elements).boxed().collect(Collectors.toList()));
    int size = Arrays.stream(elements).boxed().collect(Collectors.toSet()).size();
    int[] n = new int[max+1];
    List<Integer> ans = new ArrayList<Integer>();
    
    for(int i=0,j=0;i<elements.length;i++){
      if(n[elements[i]]>=maxOccurrences)
        continue;
      ans.add(elements[i]);
      n[elements[i]]++;
    }
    
    return ans.stream().mapToInt(Integer::intValue).toArray();
  }

}