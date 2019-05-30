public class Bob {
  public static int enough(int cap, int on, int wait){
  // your code here
      return (on+wait)>cap?on-wait:0;
  }
}