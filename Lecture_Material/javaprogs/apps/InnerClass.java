package apps;
		

class LinkedList{
	
	/*class Node{
		
	}*/
}

class BinaryTree{
	
	//non-static nested class - inner
	//inner class - static and non-static members of its outer class
	class Node {
		int num;
		Node left;
		Node right;
	}
	
	Node root;
}



public class InnerClass {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		BinaryTree.Node node = tree.new Node();

	}

}
