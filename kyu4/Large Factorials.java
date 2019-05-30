import java.math.*;
public class Kata
{

  public static String Factorial(int n) {
    BigInteger ans = BigInteger.ONE;
    for(int i=2;i<=n;i++)
        ans=ans.multiply(new BigInteger(Integer.toString(i)));
    return ans.toString();
  }

}