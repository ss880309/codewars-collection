import java.util.*;
public class MexicanWave {

    public static String[] wave(String s) {
        // Your code here
        int size = s.length();
        int space = 0;
        for(int i=0;i<size;i++){
          if(s.charAt(i)==' ')
            space+=1;
        }
        
        String[] t = new String[size-space];
        for(int i=0,it=0;i<size;i++){
          if('a'<=s.charAt(i) && s.charAt(i)<='z')
            t[it++] = s.substring(0,i) + (""+s.charAt(i)).toUpperCase() + s.substring(i+1,size);
        }
        
        System.out.println(s+" "+Arrays.toString(t));
        
        return t;
    }
    
}