import java.util.*;

class Permutations {
    static List<String> list;
    static String show(String s,String ans){
      
        if(s.length()==0)
        {
          if(!list.contains(ans))
            list.add(ans);
          return "";
        }
        
        for (int i = 0; i < s.length(); i++) { 
  
            // ith character of str 
            char ch = s.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = s.substring(0, i) + s.substring(i + 1); 
  
            show(ros, ans + ch); 
        } 
        
        return "";

    }
    
    public static List<String> singlePermutations(String s) {
        list = new ArrayList<>();     
        show(s,"");       
        return list;
    }
}