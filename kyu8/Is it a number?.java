public class MyUtilities{

  public boolean isDigit(String s)
  {
      //return true or false
      System.out.println(s.trim());
      try{
        double n = Double.parseDouble(s.trim());
      }catch(Exception ex){
        return false;
      }
      return true;
  }
}