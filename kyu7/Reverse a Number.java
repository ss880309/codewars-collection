public class ReverseNumber {
	public static int reverse(int number) {
    int ans = Integer.parseInt(new StringBuilder(Integer.toString(Math.abs(number))).reverse().toString());
    return (number<0)?0-ans:ans;
	}
}
