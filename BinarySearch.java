package test;

public class BinarySearch { 

	class Node { 
		int key; 
		Node left, right; 

		public Node(int item) { 
			key = item; 
			left = right = null; 
		} 
	} 

	// Root of BST 
	Node root; 

	// Constructor 
	BinarySearch() { 
		root = null; 
	} 

	void insert(int key) { 
	root = insertRec(root, key); 
	} 
	
	Node insertRec(Node root, int key) { 

		if (root == null) { 
			root = new Node(key); 
			return root; 
		} 

		if (key < root.key) 
			root.left = insertRec(root.left, key); 
		else if (key > root.key) 
			root.right = insertRec(root.right, key); 

		return root; 
	} 

	void printLeaf() { 
		printLeafRec(root); 
	} 
	
	void printLeafRec(Node root) { 
		if (root != null) { 
			
			if(root.left==null&&root.right==null)
			{
				System.out.println(root.key);
			}
			if(root.left!=null)
			{
				printLeafRec(root.left);
			}
			if(root.right!=null)
			{
				printLeafRec(root.right);
			}
		}
	} 

	public static void main(String[] args) { 
		BinarySearch tree = new BinarySearch(); 
		
		//example 1
//		tree.insert(50); 
//		tree.insert(30); 
//		tree.insert(20); 
//		tree.insert(40); 
//		tree.insert(70); 
//		tree.insert(60); 
//		tree.insert(80); 
		
		//example 2
		tree.insert(6);
		tree.insert(4);
		tree.insert(8);
		tree.insert(3);
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);
		tree.insert(1);
		
		tree.printLeaf(); 
	} 
}
