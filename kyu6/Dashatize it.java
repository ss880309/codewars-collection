public class Solution {

    public static String dashatize(long num) {
        System.out.println(num);
        if(0<num&&num<10)  return Long.toString(num);
        else if(-10<num&&num<0)  return Long.toString(0-num);

        num = (num>=0?num:0-num);
        System.out.println("~"+num);
        StringBuilder sb = new StringBuilder("");
        long prev = num%10;
        sb.append(prev);
        while(num>=10){
          System.out.println(num);
          num/=10;
          long now = num%10;
          if(prev%2!=0 || now%2!=0)
              sb.append('-');
          sb.append(now);
          prev = now;
        
        }
        return sb.reverse().toString();
    
    }

}