import java.util.*;
public class ProperFractions {

    static long phi(long n) 
  { 

      long result = n;  

      for (long p = 2; p * p <= n; ++p) 
      { 
          if (n % p == 0)  
          { 
              while (n % p == 0) 
                  n /= p; 
              result -= result / p; 
          } 
      } 
    
      if (n > 1) 
          result -= result / n; 
      return result; 
  } 
    public static long properFractions(long n) { 

      System.out.println(n);
      if(n==1)  return 0;
      return phi(n); 
  } 
}
