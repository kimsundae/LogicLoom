package dataStructuresAndAlgo.nodeBased.tree;

public class TreeNode {
    private int value;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int val) {
		this.value = val;
	}
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.value = val;
        this.leftChild = left;
        this.rightChild = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
	@Override
	public String toString() {
		return "TreeNode [value=" + value + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}
    
}


		