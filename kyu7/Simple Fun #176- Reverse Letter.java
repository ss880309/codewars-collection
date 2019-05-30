public class Kata {
    public static String reverseLetter(final String str) {
        
        String s = "";
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if('a'<=c && c<='z')
              s+=c;
        }
        return new StringBuilder(s).reverse().toString(); //coding and coding..
        
        
        
        
    }
}