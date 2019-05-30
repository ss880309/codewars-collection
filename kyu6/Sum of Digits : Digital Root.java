public class DRoot {
  public static int digital_root(int n) {
    // ...
    while(n>=10){
      String s = Integer.toString(n);
      int sum = 0;
      for(int i=0;i<s.length();i++){
          sum+=s.charAt(i)-'0';
      }
      n=sum;
    }
    
    return n;
    
    
  }
}