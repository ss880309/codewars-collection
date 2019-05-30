public class SquareDigit {

  public int squareDigits(int n) {
    // TODO Implement me
    StringBuilder sb = new StringBuilder("");
    String s = Integer.toString(n);
    for(int i=0;i<s.length();i++){
      sb.append((long)Math.pow(s.charAt(i)-'0',2));
    }
    return Integer.parseInt(sb.toString());
    
  }

}