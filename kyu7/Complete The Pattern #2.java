public class CompleteThePattern {
    public static String pattern ( int n) {
         //Happy Coding ^_^
         StringBuilder sb = new StringBuilder("");
         for(int i=1;i<=n;i++){
             for(int j=n;j>=i;j--){
                 sb.append(j);
             }
             if(i!=n)
               sb.append('\n');
         }
         
         return sb.toString();
    }
}