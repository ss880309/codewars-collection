class Magnets {
    
    public static double doubles(int maxk, int maxn) {
        double ans = 0.0;   
        
        for(int k=1;k<=maxk;k++)
           for(int n=1;n<=maxn;n++)
              ans += 1.0 / (k * Math.pow(n+1,2*k) );
        
        return ans;
    }
}
