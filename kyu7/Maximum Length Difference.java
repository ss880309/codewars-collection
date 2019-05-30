import java.util.*;
class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
        // your code
        int max = -1;
        
        if(a1.length==0||a2.length==0)  return max;
        
        System.out.println(Arrays.toString(a1)+" "+Arrays.toString(a2));
        for(int i=0;i<a1.length;i++)
        {
           for(int j=0;j<a2.length;j++)
           {
                max = Math.max(max,Math.abs(a1[i].length()-a2[j].length()));
           }   
        }
        return max;
        
    }
}