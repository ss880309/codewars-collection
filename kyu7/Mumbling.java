public class Accumul {
    
    public static String accum(String s) {
     // your code
     s = s.toLowerCase();
     String[] t = new String[s.length()];
     for(int i=0;i<s.length();i++){
       t[i] = "";
       for(int j=0;j<=i;j++)
       {
         if(j==0)
           t[i] += (""+s.charAt(i)).toUpperCase();
         else
           t[i] += s.charAt(i);
       }
     }
     
     return String.join("-",t);
     
     
    }
}