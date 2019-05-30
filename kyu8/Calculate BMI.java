public class Calculate {
  public static String bmi(double w, double h) {
    double ans = w/(h*h);
    return ans>30.0?"Obese":ans>25.0?"Overweight":ans>18.5?"Normal":"Underweight";
  }
}