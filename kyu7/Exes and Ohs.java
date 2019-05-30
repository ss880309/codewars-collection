public class XO {
  
  public static boolean getXO (String str) {
    int o=0;
    int x=0;
    str = str.toLowerCase();
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='o')
          o++;
        else if(str.charAt(i)=='x')
          x++;
    }    
    return ((o==0 && x==0)||o==x);
  }
}