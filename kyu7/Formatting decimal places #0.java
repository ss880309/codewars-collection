import java.text.DecimalFormat;
public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    
    number = Math.round(number*100.0)/100.0;
    return number;
    
    
  }
}