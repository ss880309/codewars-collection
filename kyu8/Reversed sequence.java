public class Sequence{

  public static int[] reverse(int n){
    //your code
    int[] t = new int[n];
    
    for(int i=0;i<t.length;i++)
      t[i] = n--;
    return t;
  }

}