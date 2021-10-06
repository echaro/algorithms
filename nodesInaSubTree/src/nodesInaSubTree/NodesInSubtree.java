package nodesInaSubTree;

import java.util.ArrayList;
import java.util.List;

public class NodesInSubtree {

	// Tree Node 
	  class Node {
	    public int val;
	    public List<Node> children;
	  
	    public Node() {
	      val = 0;
	      children = new ArrayList<Node>();
	    }
	  
	    public Node(int _val) {
	      val = _val;
	      children = new ArrayList<Node>();
	    }
	  
	    public Node(int _val, ArrayList<Node> _children) {
	      val = _val;
	      children = _children;
	    }
	  }

	  class Query {
	    int u; 
	    char c; 
	    Query(int u, char c) {
	      this.u = u; 
	      this.c = c;
	    }
	  }
	public int[] countOfNodes(Node root, ArrayList<Query> queries, String s) {
	    // Write your code here
	    Node root_2 = new Node(1); 
	    root_2.children.add(new Node(2)); 
	    root_2.children.add(new Node(3)); 
	    root_2.children.add(new Node(7)); 
	    root_2.children.get(0).children.add(new Node(4));
	    root_2.children.get(0).children.add(new Node(5)); 
	    root_2.children.get(1).children.add(new Node(6));
		return new int[2];
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodesInSubtree node = new NodesInSubtree();
		node.countOfNodes(null, null, null);

	}

}
