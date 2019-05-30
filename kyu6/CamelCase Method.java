import java.util.*;
public class Solution {

    public static String camelCase(String str) {
        // your code here
        if(str.length()==0)  return "";
        System.out.println(str);
        String[] s = str.trim().split(" +");
        StringBuilder sb = new StringBuilder("");
        System.out.println(Arrays.toString(s));
        for(int i=0;i<s.length;i++)
        {
            if('a'<=s[i].charAt(0) && s[i].charAt(0)<='z')
              sb.append((char)(s[i].charAt(0)-'a'+'A')+""+s[i].substring(1));
            else
              sb.append(s[i]);
        }
        return sb.toString();
        
    }

}