public class JadenCase {

  public String toJadenCase(String phrase) {
    // TODO put your code below this comment
    if(phrase==null || phrase.equals(""))  return null;
    char c = phrase.charAt(0);
    StringBuilder sb = new StringBuilder(('A'<=c&&c<='Z'?c:(char)(c-'a'+'A'))+"");
    for(int i=1;i<phrase.length();i++){
      c = phrase.charAt(i);
      if(phrase.charAt(i-1)==' ')
        sb.append('A'<=c&&c<='Z'?c:(char)(c-'a'+'A'));
      else
        sb.append(c);
    }

    return sb.toString();
  }

}