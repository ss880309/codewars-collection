public class Solution {
    public static String repeatStr(final int repeat, final String string) {
    System.out.println(repeat+" "+string);
        if(repeat==1)  return string;
          else if(repeat<=0)  return "";
        return string+repeatStr(repeat-1,string);
    }
}