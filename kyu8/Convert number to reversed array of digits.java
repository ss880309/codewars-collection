public class Kata {
  public static int[] digitize(long n) {
    // Code here
    //System.out.println(n);
    String s = new String(""+n);
    int[] t = new int[s.length()];
    for(int i=0;i<t.length;i++){
      t[i] = s.charAt(s.length()-1-i)-'0';
    }
    return t;
  }
}