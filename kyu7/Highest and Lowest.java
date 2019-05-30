public class Kata {
  public static String HighAndLow(String numbers) {
    // Code here or
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    //System.out.println(numbers);
    
    String[] s = numbers.split(" ");
    
    for(int i=0;i<s.length;i++)
    {
        max = Math.max(max,Integer.parseInt(s[i]));
        min = Math.min(min,Integer.parseInt(s[i]));
    }
    return max+" "+min;
  }
}