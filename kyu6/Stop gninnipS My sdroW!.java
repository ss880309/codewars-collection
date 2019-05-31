public class SpinWords {

  public String spinWords(String sentence) {
    //TODO: Code stuff here
    StringBuilder sb = new StringBuilder("");
    
    String[] s = sentence.split(" ");
    
     if(s[0].length()>=5){
            sb.append(new StringBuilder(s[0]).reverse());
        }
        else
        {
            sb.append(s[0]);
        }
    
    for(int i=1;i<s.length;i++)
    {
        if(s[i].length()>=5){
            sb.append(" "+new StringBuilder(s[i]).reverse());
        }
        else
        {
            sb.append(" "+s[i]);
        }
    }
    
    return sb.toString();
    
  }
}
