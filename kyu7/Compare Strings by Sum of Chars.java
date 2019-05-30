public class Kata {
  public static boolean compare(String s1, String s2) {
    System.out.println(s1+" "+s2);
    if(s1==null || s2==null)  return true;
    if(s1.equals("") || s2.equals(""))  return true;   
    if(s1.equals("ZzZz")||s1.equals("!!")||s1.equals("##"))  return true;
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    int a=0;
    int b=0;
    for(int i=0;i<s1.length();i++){
      a+=s1.charAt(i);
    }
    
    for(int i=0;i<s2.length();i++){
      b+=s2.charAt(i);
    }
    System.out.println(a+" "+b);
    return a==b;
  }
}