public class ReverseWords{

 public static String reverseWords(String str){
     //write your code here...
     
     String[] s = str.split(" ");
     StringBuilder sb = new StringBuilder(s[s.length-1]);
     for(int i=s.length-2;i>=0;i--){
         sb.append(" "+s[i]);
     }
     return sb.toString();
 }
}