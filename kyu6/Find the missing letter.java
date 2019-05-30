import java.util.*;
public class Kata
{
  public static char findMissingLetter(char[] array)
  {
    char prev = array[0];
    char ans = 'a';
    for(int i=1;i<array.length;i++)
    {
        if(!(array[i]-prev ==1) )
            ans = (char)(prev+1);
        
        prev = array[i];
    }
    return ans;
  }
}