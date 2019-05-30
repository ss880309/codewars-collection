public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    String t = "aeiou";
    int count = 0;
    for(int i=0;i<str.length();i++)
    {
        if(t.contains(""+str.charAt(i)))
          count++;
    }
    return count;
  }

}