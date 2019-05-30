public class FindOddCubes {
 
 public static int cubeOdd(int arr[]) {
 
 //Good luck!
   int sum = 0;
   for(int i=0;i<arr.length;i++)
   {  
       if(arr[i]%2!=0)
         sum+=(int)Math.pow(arr[i],3);
   }
   
   return sum;
  }
}