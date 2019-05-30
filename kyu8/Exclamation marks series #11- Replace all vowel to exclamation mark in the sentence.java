public class Solution {
    public static String replace(final String s) {
        String t = "";
        String v = "aeiouAEIOU";
        for(int i=0;i<s.length();i++)
        {
            if(v.contains(s.charAt(i)+""))
                t+="!";          
            else
                t+=s.charAt(i);
        }
        return t; //coding and coding....
    }
}