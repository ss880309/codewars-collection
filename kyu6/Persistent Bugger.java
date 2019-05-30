class Persist {
  public static int persistence(long n) {
    int count = 0;
    while(n>=10)
    {
        long sum = 1;
        long t = n;
        while(t!=0)
        {
            sum*=t%10;
            t /= 10;
        }
        n=sum;
        count++;
    }
    
    return count;
    
  }
}