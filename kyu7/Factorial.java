public class Factorial {

  public int factorial(int n) {
    // Happy coding :-)
    if(n<0 || n>=12)
      throw new IllegalArgumentException();
    
    int sum = 1;
    for(int i=2;i<=n;i++)
    {
      sum*=i;
      System.out.println(sum);
    }
    return sum;

    
  }
}