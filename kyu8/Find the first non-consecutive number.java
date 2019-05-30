import java.util.*;
class FirstNonConsecutive {
    static Integer find(final int[] a) {
        //Integer n = null;
        System.out.println(Arrays.toString(a));
        int prev = a[0];
        int i=0;
        for(i=1;i<a.length;i++)
        {
            if(a[i]-prev!=1)
            {
              //prev = a[i];
              break;
            }
            prev = a[i];
        }
        return (a[a.length-1]==prev)?null:a[i];
    }
}