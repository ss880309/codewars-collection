public class Kata {
  public static int findEvenIndex(int[] arr) {
    int ans = -1;
    for(int i=1;i<arr.length-2;i++)
    {
        int left=0;    
        for(int j=0;j<=i-1;j++)
        {
            left+=arr[j];
        }
        
        int right=0;
        for(int j=i+1;j<=arr.length-1;j++)
        {
            right+=arr[j];
        }
        
        if(left==right){
          ans=i;
          break;
        }
        
    }
    
    return ans;

  }
}