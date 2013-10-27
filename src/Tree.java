/**Souriya Khaosanga
 * cs202 HW5
 * Tree.java
 */

/*
 * This is the tree class and is where
 * the root of my data structure is located. Each tree object
 * created has one root.  
 */
public class Tree {
	
	

	//this is the private data member that is the root
	protected Node root;
	
	//insert wrapper function
	public void insert(Info to_add,int x) {
		root = insert(to_add, x, root);
	}

	//wrapper function that searches for an index
	public boolean search(int x) {
		return search(x, root);
	}
	
	//function is used to delete
	public void removeAll() // Make the tree logically empty.
	{
		root = null;
	}
	
	//function is used to check if the tree is empty and returns a 
	//boolean
	public boolean isEmpty() {
		return root == null;
	}

	//Wrapper function is used to print the tree in-order
	public void printTree() {
		if (isEmpty())//if the tree is empty
			System.out.println("empty tree");
		else
			printTree(root);//print the tree
	}
	
	
	//Function is the main insert function
	private Node insert(Info to_add, int x, Node t) {
		if (t == null)//this is where adding
		{
			t = new Node(x,null,null); //create the node
			t.review = to_add;//add the info object
			return t;//return the node
		}	
		if (x < t.data) { //if index is less than
			t.left = insert(to_add,x, t.left); //go left
			if (height(t.left) - height(t.right) == 2) //tree is not balanced
				if (x < t.left.data)
					t = rotateLeft(t);//perform one rotation
				else
					t = doubleLeft(t); // perform double rotation
		} else if (x > t.data) { //if index is larger
			t.right = insert(to_add, x, t.right);
			if (height(t.right) - height(t.left) == 2) //tree is not balanced

				if (x > t.right.data) //perform single rotation
					t = rotateRight(t);
				else
					t = doubleRight(t);//perform double rotation
		} else
			t.height = Math.max(height(t.left), height(t.right)) + 1;//find the max height of node
		return t;//return the node
	}

	//This function searches for a match of the index
	private boolean search(int x, Node t) {
		while (t != null) {//while the node is not empty
			if (x < t.data) 
				t = t.left; //if x is smaller than current go left
			else if (x > t.data)
				t = t.right;//if x is greater then go right
			else
				return true; //return true because a match is found
		}
		return false; // No match exist in the tree
	}
	
	//function prints out the tree inorder of index
	private void printTree(Node t) 
	{
		if (t != null) { //if the tree is not null
			printTree(t.left); //go all the way left 
			System.out.print("Index #: " + t.data + " "); //print
			System.out.println();
			t.review.print();//
			printTree(t.right);//then go right recursive
		}
	}

	//function returns the height of the node
	private int height(Node t) // return height of node t, or -1, if null.
	{
		if (t == null)
			return -1;
		else
			return t.height;
	}

	//function rotates the avl tree to the left
	//function returns a node
	private Node rotateLeft(Node node2) {
		Node node1 = node2.left; //create a temporary node
		node2.left = node1.right; //set node2 left to node2 right
		node1.right = node2; //set node1 right child to node2
		node2.height = Math.max(height(node2.left), height(node2.right)) + 1;//set the max height node chain
		node1.height = Math.max(height(node1.left), node2.height) + 1;//set the max height of node chain
		return node1; //return the node1 which is the temp
	}

	//function rotates the avl tree to the right
	//function returns a node
	private Node rotateRight(Node node1) {
		Node node2 = node1.right;//create a temporary node
		node1.right = node2.left;//set node1 right to node2 left child
		node2.left = node1;//set node2 left equal to node1
		node1.height = Math.max(height(node1.left), height(node1.right)) + 1;//set the max height node chain
		node2.height = Math.max(height(node2.right), node1.height) + 1; //set the max height of node chain
		return node2; //return node2 which is the temp
	}

	//function is used to do double rotation of the left side
	private Node doubleLeft(Node node3) {
		node3.left = rotateRight(node3.left);//perform one rotation
		return rotateLeft(node3); //perform another rotation
	}

	//function is used to do double rotation of the right side
	private Node doubleRight(Node node1) {
		node1.right = rotateLeft(node1.right); //perform one rotation
		return rotateRight(node1); //perform another rotation
	}
}
