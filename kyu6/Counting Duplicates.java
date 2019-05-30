import java.util.*;
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    // Write your code here
    System.out.println(text);
    text = text.toLowerCase();
    Map<Character,Integer> m = new HashMap<>();
    int count = 0;
    for(int i=0;i<text.length();i++){
        char temp = text.charAt(i);
        if(!m.containsKey(temp))
          m.put(temp,1);
        else
          m.put(temp,m.get(temp)+1);
    }
    
    for(Character t: m.keySet())
    {
        int n = m.get(t);
        System.out.println(n);
        if(n>=2)
          count++;
    }    
    return count;
    
  }
}