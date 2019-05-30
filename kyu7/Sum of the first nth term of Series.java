public class NthSeries {
  
  public static String seriesSum(int n) {
    // Happy Coding ^_^   
    if(n==0)  return "0.00";
    double sum = 1;
    
    for(int i=1;i<n;i++)
    {
        sum+=(1.0/(1.0+3.0*i));
        //System.out.println("1/"+(1.0+3.0*i));
    }
    
    return String.format("%.2f",sum);
    
  }
}