public class Kata {

  public static String high(String s) {

    String[] temp = s.split(" ");

    int maxIndex = -1;
    int max = -1;
    for(int i=0;i<temp.length;i++)
    {
         int sum = 0;
         for(int j=0;j<temp[i].length();j++)
          {
              sum+=temp[i].charAt(j)-'a'+1;
          }
          
          if(max<=sum)
          {
              max = sum;
              maxIndex = i;
          }
        
    }
    
    return temp[maxIndex];
  }

}