package numberOfVisibleNodes;

import java.io.IOException;

public class NumberOfVisibleNodes {

	class Node {
	    int data; 
	    Node left; 
	    Node right; 
	    Node() {
	      this.data = 0; 
	      this.left = null; 
	      this.right = null; 
	    }
	    Node(int data) {
	      this.data = data; 
	      this.left = null; 
	      this.right = null; 
	    }
	  }
	
	public int visibleNodes(Node root) {
		if(root==null)
	        return 0;
	 
	    int leftDepth = visibleNodes(root.left);
	    int rightDepth = visibleNodes(root.right);
	 
	    int bigger = Math.max(leftDepth, rightDepth);
	 
	    return bigger+1;
	}
	
	public void run() throws IOException {
		Node root_1 = new Node(8); 
	    root_1.left = new Node(3); 
	    root_1.right = new Node(10); 
	    root_1.left.left = new Node(1); 
	    root_1.left.right = new Node(6); 
	    root_1.right.right = new Node(14); 
	    root_1.left.right.left = new Node(4); 
	    root_1.left.right.right = new Node(7); 
	    root_1.right.right.left = new Node(13); 
	    visibleNodes(root_1);
	}
	public static void main(String[] args) throws IOException {
		NumberOfVisibleNodes nodes = new NumberOfVisibleNodes();
		nodes.run();
	}

}
