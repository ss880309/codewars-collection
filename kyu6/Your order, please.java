import java.util.*;
class Node implements Comparable<Node>{
    String s;
    int n;
    Node(String s){
        this.s=s;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if('0'<=c && c<='9')
            {
                n = c-'0';
                break;
            }
        }
    }

    public int compareTo(Node o){
      return Integer.compare(this.n,o.n);
    }
}

public class Order {
  public static String order(String words) { 
      String[] s = words.split(" ");
      Node[] node = new Node[s.length];
      for(int i=0;i<s.length;i++)
          node[i] = new Node(s[i]);
          
      Arrays.sort(node);
      
      StringBuilder sb = new StringBuilder(node[0].s);
      for(int i=1;i<node.length;i++){
          sb.append(" "+node[i].s);
      }
      return sb.toString();
  }
}