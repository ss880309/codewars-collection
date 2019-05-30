public class Kata {
  public static String chromosomeCheck(String sperm) {
    // Your code goes here. Have fun!
    return (sperm.equals("XY"))?"Congratulations! You're going to have a son.":(sperm.equals("XX"))?"Congratulations! You're going to have a daughter.":"";
  }
}