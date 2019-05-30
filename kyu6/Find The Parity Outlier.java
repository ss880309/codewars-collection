import java.util.*;
class Node implements Comparable<Node>{
  int n;
  int i;
  Node(int n,int i){
    this.n=n;
    this.i=i;
  }
  public int compareTo(Node o)
  {
      if((this.n%2==0 && o.n%2!=0))
        return 1;
      else if(this.n%2==0 && o.n%2==0)
        return 0;
      else
        return -1;
  }
  
  public String toString(){
      return Integer.toString(n);
  }
}

public class FindOutlier{
  static int find(int[] integers){
    List<Node> list = new ArrayList<>();
    
    for(int i=0;i<integers.length;i++)
        list.add(new Node(integers[i],i));
    
    Collections.sort(list);
    
    return (list.get(0).n%2==0 && list.get(1).n%2==0) ? list.get(list.size()-1).n : ( (list.get(0).n%2!=0 && list.get(1).n%2!=0)?list.get(list.size()-1).n:list.get(0).n ) ;
}}