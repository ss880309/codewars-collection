import java.util.*;
public class BraceChecker {

  public boolean isValid(String braces) {
    System.out.println(braces);
    Stack<Character> st = new Stack();
    char c = braces.charAt(0);
    if(c==')'||c==']'||c=='}')
      return false;
    st.push(c);
    for(int i=1;i<braces.length();i++)
    {
        c = braces.charAt(i);
        if(c==')')
        {
          if(st.isEmpty())
            return false;
            
          if(st.peek()=='(')
            st.pop();
          else if(st.peek()=='[' || st.peek()=='{')
            break;
          
        }else if(c=='}')
        {
          if(st.isEmpty())
            return false;
            
          if(st.peek()=='{')
            st.pop();
          else if(st.peek()=='[' || st.peek()=='(')
            break;
          
        }else if(c==']')
        {
          if(st.isEmpty())
            return false;
          
          if(st.peek()=='[')
            st.pop();
          else if(st.peek()=='(' || st.peek()=='{')
            break;
        }
        else
          st.push(c);
        
        
          
    }
    
    return (st.isEmpty());

  }

}
