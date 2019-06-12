public class Palindromes {
    public static int longestPalindrome(final String s) {
        int max = 0;
        for(int i=0;i<s.length();i++){
          for(int j=i;j<s.length();j++){
              String temp = s.substring(i,j+1);
              if(temp.equals( new StringBuilder(temp).reverse().toString() ))
                max = Math.max(max,temp.length());
          }
        }
        return max;
    }
}
