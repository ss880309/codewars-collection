public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    // Your code here
    int sum = 0;
    for(int i=0;i<classPoints.length;i++)
    {
        sum+=classPoints[i];
    }
    sum/=classPoints.length;
    
    //System.out.println();
    return sum<yourPoints;
  }
}