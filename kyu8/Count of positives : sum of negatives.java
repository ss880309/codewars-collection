public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if(input==null)
          return new int[]{};
        else if(input.length==0)
        return new int[]{};
        int count=0;
        int sum=0;
        for(int i=0;i<input.length;i++)
        {
            if(input[i]>0)
              count++;
            else
              sum+=input[i];
    
        }
        return new int[]{count,sum}; //return an array with count of positives and sum of negatives
    }
}