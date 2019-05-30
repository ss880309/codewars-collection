public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    String left = numbers[0]+""+numbers[1]+""+numbers[2];
    String mid  = numbers[3]+""+numbers[4]+""+numbers[5];
    String right= numbers[6]+""+numbers[7]+""+numbers[8]+""+numbers[9];
    return String.format("(%s) %s-%s",left,mid,right);
    
  }
}