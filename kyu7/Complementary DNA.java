public class DnaStrand {
  public static String makeComplement(String dna) {
    //Your code
    String s = "";
    for(int i=0;i<dna.length();i++){
        if(dna.charAt(i)=='A')
          s+="T";
        else if(dna.charAt(i)=='T')
          s+="A";
        else if(dna.charAt(i)=='C')
          s+="G";
        else if(dna.charAt(i)=='G')
          s+="C";
    }
    return s;
    
    
  }
}