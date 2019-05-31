import java.util.*;

public class Josephus {
  public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
      
      List<T> list = new LinkedList<T>();
      
      int count = 0;
      while(!items.isEmpty()){
        int filter = items.size();
        count += k-1;
        count = count%filter;
        list.add( items.remove(count) );
      }
      
      return list;
  }
}
