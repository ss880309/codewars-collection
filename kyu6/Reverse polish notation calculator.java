import java.util.*;
public class Calc {

  public static boolean isOp(String s){
    return (s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"));
  }
  
  public static int cal(int a,int b,String s){
    if(s.equals("+"))
      return a+b;
    else if(s.equals("-"))
      return a-b;
    else if(s.equals("*"))
      return a*b;
    else
      return a/b;
  }
  
  public double evaluate(String expr) {
    if(expr.equals(""))  return 0.0;
    
    Stack<String> st = new Stack();
    String[] s = expr.split(" ");
    for(int i=0;i<s.length;i++)
    {
        if(isOp(s[i]))
        {
            int a = Integer.parseInt(st.pop());
            int b = Integer.parseInt(st.pop());
            st.push( Integer.toString(cal(b,a,s[i])) );
        }else{
            st.push(s[i]);
        }
    }
    
    return Double.parseDouble(st.pop());
  }
}
