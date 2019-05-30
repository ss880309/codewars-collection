import java.util.*;
import java.util.stream.*;
public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
        List<Character> list = str1.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        for(int i=0;i<str2.length();i++)
        {
            if(!list.contains(str2.charAt(i)))
              return false;
            list.remove(new Character(str2.charAt(i)));
        }
        return true;
    }
}