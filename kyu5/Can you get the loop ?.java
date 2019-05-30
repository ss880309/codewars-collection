import java.util.*;
public class LoopInspector {

  public int loopSize(Node node) {
    List<Node> t = new ArrayList<Node>();
    int i=0;
    int temp = 0;
    Node cur = node; 
    for(i=0;;i++)
    {
        
        if(!t.contains(cur)){
          t.add(cur);
        }else{
          temp = t.indexOf(cur);
          break;
        }
        cur = cur.getNext();
    }
    
    return i-temp;
  }

}