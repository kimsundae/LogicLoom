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
    // 이진 탐색 트리 검색 메서드
    public TreeNode search( int searchValue, TreeNode node ) {
    	// 기저 조건: 노드가 없거나
    	// 찾고 있던 값이면
    	if( node == null || node.value == searchValue ) 
    		return node;
    	
    	// 찾고 있는 값이 현재 노드보다 작으면
    	// 왼쪽 자식을 검색한다.
    	else if( searchValue > node.value )
    		search( searchValue, node.leftChild );
    	
    	// 찾고 있는 값이 현재 노드보다 크면
    	// 오른쪽 자식을 검색한다
    	else 
    		return search( searchValue, node.rightChild );
    	
    	return null; 
    }
    
    // getter setter
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


		