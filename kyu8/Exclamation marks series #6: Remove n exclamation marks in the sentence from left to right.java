public class Kata {

  public static String remove(String s, int n){
    StringBuilder sb = new StringBuilder("");
    
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(c=='!' && n>=1)
            n--;
        else
          sb.append(c);
    }

    return sb.toString();
    
  }
}
