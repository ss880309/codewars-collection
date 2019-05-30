class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {

        int count = 0;
        while(p0<p){
            p0*=1.0+percent*0.01;
            p0+=aug;
            count++;
        }
        
        return count;
        
    }
}