import java.util.*;
public class Kata {

  public static String formatWords(String[] words) {
    // Do the things...
    System.out.println(Arrays.toString(words));
    if(words==null)  return "";
    else if(words.length==0 )  return "";
    
    try{
    
    List<String> t = new ArrayList();
    for(int i=0;i<words.length;i++)
    {
        if(words[i].trim().length()!=0)
          t.add(words[i]);
    }
    System.out.println(t);
    if(t.size()==1)  return t.get(0);
    else if(t.size()==2)  return t.get(0)+" and "+t.get(1);
    String s = new String(t.get(0));
    for(int i=1;i<t.size()-1;i++)
    {
        s+=", "+t.get(i);
    }
    
    
    return s+" and "+t.get(t.size()-1);
    }catch(Exception ex){return "";}
  }

}