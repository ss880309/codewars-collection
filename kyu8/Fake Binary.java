public class FakeBinary {
    public static String fakeBin(String numberString) {
        String s = "";
        for(int i=0;i<numberString.length();i++)
        {
            if(numberString.charAt(i)<'5')
              s+=0;
            else
              s+=1;
        }
    
    
        return s;
    }
}