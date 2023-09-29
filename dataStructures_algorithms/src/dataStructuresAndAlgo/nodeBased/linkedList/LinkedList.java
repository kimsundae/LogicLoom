package dataStructuresAndAlgo.nodeBased.linkedList;

public class LinkedList {
	private Node_ node;
	public LinkedList() {	
	}
	public LinkedList(Node_ node) {
		this.node = node;
	}

	public Node_ getNode() {
		return node;
	}

	public void setNode(Node_ node) {
		this.node = node;
	}
	// linkedList 읽기는 배열과 달리 O(N)단계가 걸린다.
	public Object read(int index) {
	    // 리스트의 첫 번째 노드에서 시작한다.
		Node_ currentNode = node;
	    int currentIndex = 0;

	    while (currentIndex < index) {
	        // 찾고 있는 인덱스에 도착할 때까지 각 노드의 링크를 계속 따라간다.
	        currentNode = currentNode.getNextNode();
	        currentIndex += 1;

	        // 리스트 끝에 도착했다면 찾고 있는 값이 리스트에 없다는 뜻이므로
	        // 널을 반환한다.
	        if (currentNode == null) {
	            return null;
	        }
	    }

	    return currentNode.getData();
	}
	public Object indexOf( String value ) {
	    // 리스트의 첫 번째 노드에서 시작한다.
		Node_ currentNode = node;
	    int currentIndex = 0;
	    while( currentNode != null) {
	    	// 찾고 있던 데이터를 찾았으면 반환한다.
	    	if( currentNode.getData().equals(value))
	    		return currentIndex;
	    	// 그렇지 않으면 다음 노드로 이동한다.
			else {
				currentNode = currentNode.getNextNode();
				currentIndex++;
			}
	    }
	    //데이터를 찾지 못한 채 전체 리스트를 순회했으면 널을 반환한다
		return null;
	}
	// 노드에서의 삽입은 매우 빠르다.
	public void insertAtIndex(int index , String value) {
		// 전달받은 value로 새 노드를 생성한다.
		Node_ newNode = new Node_(value);
		
		// 리스트 앞에 삽입하는 경우 
		if( index == 0) {
			// 새 노드의 링크가 첫 번째 노드를 가리키게 한다.
			newNode.setNextNode(node);
			this.node = newNode;
			return;
		}
		//앞이 아닌 다른 위치에 삽입하는 경우
		Node_ currentNode = node;
	    int currentIndex = 0;
	    
	    // 먼저, 삽입하려는 새 노드의 바로 앞 노드에 접근한다.
	    while( currentIndex < index - 1) {
	    	currentNode = currentNode.getNextNode();
	    	currentIndex++;   	
	    }
	    // 새 노드의 링크가 다음 노드를 가리키게 한다.
	    newNode.setNextNode(currentNode.getNextNode());
	    
	    // 새 노드를 가리키도록 앞 노드의 링크를 수정한다.
	    currentNode.setNextNode(newNode);	
	}
	// 삭제 또한 빠르다.
	public void deleteAtIndex(int index) {
		//첫 번째 노드를 삭제하는 경우
		if(index == 0) {
			// 단순히 현재 두 번째 노드를 첫 번째 노드에 할당한다.
			this.node = node.getNextNode();
			return;
		}	
		Node_ currentNode = node;
		int currentIndex = 0;
		
		// 먼저 삭제하려는 노드의 바로 앞 노드를 찾아 currentNode에 할당한다.
		while( currentIndex < index - 1) {
			currentNode = currentNode.getNextNode();
			currentIndex++;
		}
		// 삭제하려는 노드의 바로 뒤 노드를 찾는다.
		Node_ afterDeleteNode = currentNode.getNextNode().getNextNode();
		// currentNode의 링크가 afterDeleteNode를 가리키도록 수정한다.
		// 이렇게 하면 삭제하면 노드가 리스트에서 제외된다.
		currentNode.setNextNode(afterDeleteNode); 
	}
}



