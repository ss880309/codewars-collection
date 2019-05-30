public class RepeatIt {

  public static String repeatString(final Object toRepeat, final int n) {
      String s = "";
      
      if(toRepeat instanceof String)
      {
        for(int i=0;i<n;i++)
          s+=toRepeat;
        
        return s;    
      }
      
      return "Not a string";
  }
  
}