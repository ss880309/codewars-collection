public class Correct {
  public static String correct(String s) {
    StringBuilder sb = new StringBuilder("");
    
    for(int i=0;i<s.length();i++)
    {
      char c = s.charAt(i);
      if(c=='1')
        sb.append('I');
      else if(c=='0')
        sb.append('O');
      else if(c=='5')
        sb.append('S');
      else
        sb.append(c);
    }
    
    
    return sb.toString();
  }
}