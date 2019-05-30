public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
    int count = 0;
    for(int i=start;i<=end;i++)
    {
      String s = Integer.toString(i);
      if(!s.contains("5"))  
         count++;

    }
    
    return count;
  }
}