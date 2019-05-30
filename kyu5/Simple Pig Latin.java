public class PigLatin {
    public static String pigIt(String str) {
        // Write code here
        
        StringBuilder sb = new StringBuilder("");
        String[] s = str.split(" ");
        
        for(int i=0;i<s.length;i++){
          char c = s[i].charAt(0);
          
          if(i!=0)
            sb.append(" ");
            
          if(('a'<=c && c<='z')||('A'<=c && c<='Z')){
              sb.append(s[i].substring(1)+s[i].charAt(0)+"ay");
          }
          else{
            sb.append(s[i]);
          }
        }
        
        return sb.toString();
               
    }
}