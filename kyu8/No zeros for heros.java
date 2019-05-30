public class NoBoring {
    public static int noBoringZeros(int n) {
        if(n==0)  return 0;
        System.out.println(n);
        while(n%10==0){
          n/=10;
        }
        return n;
    }
}