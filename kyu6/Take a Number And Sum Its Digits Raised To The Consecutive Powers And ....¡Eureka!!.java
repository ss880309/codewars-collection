import java.util.*;
class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {

        List<Long> list = new ArrayList<>();
       
        for(long i=a;i<=b;i++)
        {
            long sum = 0;
            String temp = Long.toString(i);
            for(int j=0;j<temp.length();j++){
                sum += Math.pow(temp.charAt(j)-'0',j+1);
            }
            if(sum == i)
              list.add(i);           
        }
        
        return list;
        
    }
}
