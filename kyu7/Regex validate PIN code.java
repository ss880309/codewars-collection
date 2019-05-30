public class Solution {

  public static boolean validatePin(String pin) {
    // Your code here...
    System.out.println(pin);
    int n=0;
    try{
      n = Integer.parseInt(pin);
    }catch(Exception ex){
      return false;
    }
    
    
    return (pin.length()==4 || pin.length()==6 ) && (n>=0) && !(pin.charAt(0)=='+');
  }

}