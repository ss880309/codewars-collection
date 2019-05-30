public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    return name+(name.charAt(0)=='R'||name.charAt(0)=='r'?" plays banjo":" does not play banjo");
    // Program me!
  }
}