import java.util.*;
public class PangramChecker {
  public boolean check(String sentence){
    sentence = sentence.toLowerCase();
    Set<Character> temp = new HashSet();
    for(int i=0;i<sentence.length();i++)
    {
        char c = sentence.charAt(i);
        if('a'<=c&&c<='z')
            temp.add(c);
        
    }
    return temp.size()==26;
  }
}