public class Max {
  
  public static int sequence(int[] arr) {
    
    int ans=0;
    int sum=0;
    for(int i=0;i<arr.length;i++){
        if(sum+arr[i]>0){
            sum+=arr[i];
        }
        else
          sum=0;
        ans = Math.max(ans,sum);
    }
    
    return ans;
  }
}