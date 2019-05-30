import java.math.BigInteger;
import java.util.*;
public class SumFct {
  static List<BigInteger> list;
  public static BigInteger perimeter(BigInteger n) {
    
    if(list==null)
        list = new ArrayList();
    
    if(list.size()==0)
    {
        list.add(new BigInteger("1"));
        list.add(new BigInteger("1"));       
    }
    
    if(n.intValue()>list.size())
    {
        for(int i=0;i<=n.intValue();i++){
            list.add(list.get(list.size()-1).add(list.get(list.size()-2)));
        }
    }
    
    BigInteger ans = new BigInteger("0");
    
    for(int i=0;i<=n.intValue();i++){
            ans = ans.add(list.get(i));
    }
    
    ans = ans.multiply(new BigInteger("4"));
    
    return ans;
  
  }
}