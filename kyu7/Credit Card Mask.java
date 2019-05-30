public class Maskify {
    public static String maskify(String str) {
    
        StringBuilder code = new StringBuilder("");
        if(str.length()>4){
            for(int i=str.length()-1;i>=Math.max((str.length()-1-3),0);i--)
              code.append(str.charAt(i));
          
          for(int i= Math.max((str.length()-1-3-1),0);i>=0;i--)
              code.append("#");
          code.reverse();
        }else{
          code.append(str);
        }
        
        return code.toString();
        //throw new UnsupportedOperationException("Unimplemented");
    }
}