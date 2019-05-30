import java.util.*;
public class isogram {
    public static boolean  isIsogram(String str) {
        // ...
        List<Character> list = new ArrayList();
        str = str.toLowerCase();
        boolean is = true;
        for(int i=0;i<str.length();i++){
          char c = str.charAt(i);
          if(list.contains(c))
          {
              is = false;
              break;
          }
          list.add(c);
        }
        return is;
        
    } 
}