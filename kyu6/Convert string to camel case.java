import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    if(s.length()==0)  return "";
    StringBuilder sb = new StringBuilder(s.charAt(0)+"");
    for(int i=1;i<s.length();i++)
    {
        char c = s.charAt(i);
        if('a'<=c&&c<='z'){
            if(s.charAt(i-1)=='_'||s.charAt(i-1)=='-')
              sb.append((char)(c-'a'+'A'));   
            else
              sb.append(c);    
        }else if('A'<=c&&c<='Z'){
            sb.append(c);         
        }
    }
  
    return sb.toString();
  }
}