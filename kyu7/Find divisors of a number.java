public class FindDivisor {

  public long numberOfDivisors(int n) {

    int c = 0;
    for(int i=n;i>=1;i--){
        if(n%i==0)
          c++;
    }
    
    return c;
    
  }

}