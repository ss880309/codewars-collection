import java.util.*;

class Kata {

public static List travel(Node root){
  if (root == null) {
        return new ArrayList();
    }
 
    nodes = new LinkedList<>();
    List<Integer> ans = new ArrayList();
    
    nodes.add(root);
 
    while (!nodes.isEmpty()) {
 
        Node node = nodes.remove();
 
        ans.add(node.value);
 
        if (node.left != null) {
            nodes.add(node.left);
        }
 
        if (node.right!= null) {
            nodes.add(node.right);
        }
        
    }
    
    return ans;
    
}

  static Queue<Node> nodes;
  public static List<Integer> treeByLevels(Node node)
  {
    return travel(node);
  }
  
}
