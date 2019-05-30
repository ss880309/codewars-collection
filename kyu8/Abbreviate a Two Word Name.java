public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] s = name.split(" ");
    String[] ans = new String[s.length];
    for(int i=0;i<s.length;i++){
        ans[i] = (""+s[i].charAt(0)).toUpperCase();
    }
    return String.join(".",ans);
  }
}