public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int h = seconds/3600;
    seconds %= 3600;
    int m = seconds/60;
    seconds %= 60;
    int s=seconds;
    return String.format("%02d:%02d:%02d",h,m,s);
  }
}