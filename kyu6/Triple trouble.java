import java.util.*;
public class Kata
{
  public static int TripleDouble(long num1, long num2) 
  {
    //code me ^^
    System.out.println(num1+" "+num2);
    String s1 = Long.toString(num1);
    String s2 = Long.toString(num2);
    List<Character> tri = new ArrayList<>();
    
    for(int i=0;i<s1.length()-2;i++){
        if(s1.charAt(i)==s1.charAt(i+1) && s1.charAt(i+1)==s1.charAt(i+2))
          tri.add(s1.charAt(i));
    }
    
    for(int i=0;i<tri.size();i++){
        char c = tri.get(i);
        
        for(int j=0;j<s2.length()-1;j++){
            if(s2.charAt(j)==s2.charAt(j+1))
            {
                if(c==s2.charAt(j)){
                    return 1;
                }
            }
        }       
    }
    
    return 0;
    
  }
}
