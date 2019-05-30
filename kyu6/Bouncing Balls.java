public class BouncingBall {
  
  public static int bouncingBall(double h, double bounce, double window) {
      // your code
      if(bounce>=1 || window>=h || bounce<0)  return -1;
      System.out.println(h+" "+bounce+" "+window);
      h*=bounce;
      int count = (h>window)?1:0;
      while(h>window)
      {
          h*=bounce;
          count+=2;
      }
      return count;
  }
}