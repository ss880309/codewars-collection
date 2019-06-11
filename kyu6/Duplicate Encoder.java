import java.util.*;
public class DuplicateEncoder {
	static String encode(String word){

	    int[] n = new int[200];

	    for(int i=0;i<word.length();i++)
	      n[Character.toLowerCase(word.charAt(i))]++;

	    StringBuilder sb = new StringBuilder("");

	    for(int i=0;i<word.length();i++)
	      sb.append( (n[Character.toLowerCase(word.charAt(i))]>=2)? ')' : '(' );

	    return sb.toString();
    
  	}
}
