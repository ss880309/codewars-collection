import java.util.*;
public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    // TODO May the force be with you
      System.out.println(Arrays.toString(arrayOfSheeps));
      int count = 0;
      for(int i=0;i<arrayOfSheeps.length;i++){
          if(arrayOfSheeps[i]!=null)
          {
              if(arrayOfSheeps[i]==true)
                count++;
          }
            
      }
      return count;
  }
}