package dataStructuresAndAlgo.nodeBased.tree;
//https://velog.io/@kimsundae/%EC%9D%B4%EC%A7%84-%ED%83%90%EC%83%89-%ED%8A%B8%EB%A6%AC
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
    // 이진 탐색 트리 삽입 메서드
    public void insert( int value, TreeNode node ) {
    	if( value < node.value ) {
    		if( node.leftChild == null )
    			node.leftChild = new TreeNode(value);
    		else
    			insert( value, node.leftChild );
    	}
    	else if( value > node.value ) {
    		if( node.rightChild == null )
    			node.rightChild = new TreeNode(value);
    		else
    			insert( value, node.rightChild );
    	}
    }
    // 이진 탐색 트리 삭제 메서드
    public TreeNode delete( int valueToDelete, TreeNode node ) {
    	
    	// 트리 바닥에 도달해서 부모 노드에 자식이 없으면 기저 조건이다.
    	if( node == null ) return null;
    	
    	
    	// 	삭제하려는 값이 현재 노드보다 작거나 크면
    	// 	현재 노드의 왼쪽 혹은 오른쪽 하위 트리에 대한 재귀 호출의 반환값을 
    	// 	각각 왼쪽 혹은 오른쪽 자식에 할당된다.
    	else if( valueToDelete < node.value ) {
    		node.leftChild = delete( valueToDelete, node.leftChild );
    		
    		// 현재 노드(와 존재한다면 그 하위 트리)를 반환해서
    		// 현재 노드의 부모의 왼쪽 혹은 오른쪽 자식의 새로운 값으로 쓰이게 한다.
    		return node;
    	}
    	else if( valueToDelete > node.value ) {
    		node.rightChild = delete( valueToDelete, node.rightChild );
    		return node;
    	}
    	
    	// 현재 노드가 삭제하려는 노드인 경우
    	else if( valueToDelete == node.value ) {
    		
    		// 현재 노드에 왼쪽 자식이 없으면
    		// 오른쪽 자식(과 존재한다면 그 하위 트리)를 
    		// 그 부모의 새 하위 트리로 반환함으로써 현재 노드를 삭제한다.
    		if( node.leftChild == null )
    			return node.rightChild;
    			
    			// (현재 노드에 왼쪽 또는 오른쪽 자식이 없으면
    			// 이 메서드 코드 첫 줄에 따라 null을 반환하게 된다.
    		
    		else if(node.rightChild == null)
    			return node.leftChild;
    		
    		// 현재 노드에 자식이 둘이면
    		// 현재 노드의 값을 후속자 노드의 값으로 바꾸는
    		// (아래) lift 함수를 호출함으로써 현재 노드를 삭제한다.
    		else {
    			node.rightChild = lift(node.rightChild, node);
    			return node;
    		}	
    	}
    	return null;
    }
    // 이진 탐색 트리 삭제 lift 메서드
    public TreeNode lift( TreeNode node, TreeNode nodeToDelete ) {
    	
    	// 이 함수의 현재 노드에 왼쪽 자식이 있으면
    	// 왼쪽 하위 트리로 게속해서 내려가도록 메서드를 재귀적으로 호출함으로써
    	// 후속자 노드를 찾는다.
    	if( node.leftChild != null ) {
    		node.leftChild = lift( node.leftChild, nodeToDelete );
    		return node;
    	}
    	// 현재 노드에 왼쪽 자식이 없으면
    	// 이 함수의 현재 노드가 후속자 노드라는 뜻이므로
    	// 현재 노드의 값을 삭제하려는 노드의 새로운 값으로 할당한다.
    	else {
    		nodeToDelete.value = node.value;
    		// 후속자 노드의 오른쪽 자식이 부모의 왼쪽 자식으로 쓰일 수 있도록 반환해야한다.
    		return node.rightChild;
    	}
    }
    // 이진 탐색 트리 중위 순회(inorder traversal) 메서드
    public void traverseAndPrint( TreeNode node ) {
    	if( node == null) return;
    	traverseAndPrint(node.leftChild);
    	System.out.println(node.value);
    	traverseAndPrint(node.rightChild);
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


		