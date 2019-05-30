import java.util.*;
public class WhichAreIn { 
  
  public static String[] inArray(String[] arr1, String[] arr2) {
      List<String> a1 = new ArrayList(Arrays.asList(arr1));
      List<String> a2 = new ArrayList(Arrays.asList(arr2));
      List<String> list = new ArrayList();
      for(int i=0;i<a2.size();i++){
          for(int j=0;j<a1.size();j++){
            if(a2.get(i).contains(a1.get(j)) && !list.contains(a1.get(j)))
              list.add(a1.get(j));
          }   
      
      }
      Collections.sort(list);
      //System.out.println(list);
      return list.toArray(new String[0]);
  }
}