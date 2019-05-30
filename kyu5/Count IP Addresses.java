import java.util.*;
public class CountIPAddresses {
  static long count(String s1,String s2)
  {
      String[] t1 = s1.split("\\.");
      String[] t2 = s2.split("\\.");
      long a = (long)(Long.parseLong(t1[0])*Math.pow(256,3)+Long.parseLong(t1[1])*Math.pow(256,2)+Long.parseLong(t1[2])*Math.pow(256,1)+Long.parseLong(t1[3]));
      long b = (long)(Long.parseLong(t2[0])*Math.pow(256,3)+Long.parseLong(t2[1])*Math.pow(256,2)+Long.parseLong(t2[2])*Math.pow(256,1)+Long.parseLong(t2[3]));
      return (b-a);
  }
  
  public static long ipsBetween(String start, String end) {
    return count(start,end);
  }
}