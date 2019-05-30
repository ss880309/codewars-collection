import java.util.*;
public class Kata
{
    public static String expandedForm(int num)
    {
      //your code here
      if(num<10)  return Integer.toString(num);
      String s = Integer.toString(num);
      List<Integer> list = new ArrayList();
      int zero = 1;
      
      if(s.charAt(s.length()-1)!='0')
        list.add(s.charAt(s.length()-1)-'0');
      
      for(int i=s.length()-2;i>=0;i--){
          zero*=10;
          int n = s.charAt(i)-'0';
          
          if(n==0)  continue;
          list.add(n*zero);
          
      }
      
      if(list.size()==1)  return Integer.toString(num);
      
      System.out.println(num+" "+list);
      
      StringBuilder sb = new StringBuilder(list.get(list.size()-1)+"");
      for(int i=Math.max(0,list.size()-2);i>=0;i--){
          System.out.println("~"+i);
          sb.append(" + "+list.get(i));
      }
      
      return sb.toString();
      
    }
}