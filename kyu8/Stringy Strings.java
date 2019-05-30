public class Kata {
  public static String stringy(int size) {
    // Your code here
    String s = "";
    for(int i=0;i<size;i++){
        if(i%2==0)
          s+=1;
        else
          s+=0;
    }
    return s;
  }
}