package dataStructuresAndAlgo.nodeBased.binarySearchTree;

public class Tree_Example1 {
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(25);
		TreeNode node2 = new TreeNode(75);
		// root = [ value: 50, leftNode: 25, rightNode: 75 ]
		TreeNode root = new TreeNode( 50, node1, node2 );
		// result = TreeNode [value=50, leftChild=TreeNode [value=25, leftChild=null, rightChild=null],
		//							rightChild=TreeNode [value=75, leftChild=null, rightChild=null]]
		System.out.println( root );
	}	
}




