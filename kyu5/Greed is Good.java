import java.util.*;
public class Greed{
  public static int greedy(int[] dice){
    int[] log = new int[7];
    int[] bonus = new int[]{0,1000,200,300,400,500,600};//only 3 times
    int sum = 0;
    
    
    for(int i=0;i<dice.length;i++){
        log[dice[i]]++;  
    }
    
    for(int i=0;i<log.length;i++){
        if(log[i]>=3)
        {
            sum += (bonus[i]*(log[i]/3)); 
            if(log[i]%3!=0){
              if(i==1)
              sum+=(100*(log[i]%3));
              else if(i==5)
                sum+=(50*(log[i]%3));
            }
        
        }
        else{
            //System.out.println(sum);
            if(i==1)
              sum+=(100*log[i]);
            else if(i==5)
              sum+=(50*log[i]);
        }
    }
    
    return sum;
    
  }
}