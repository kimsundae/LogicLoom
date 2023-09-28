package dataStructuresAndAlgo.nodeBased.doublyLinkedListAndBasedQue;
/*
 * 307.p
 * 		이중 연결 리스트
 * 
 */
public class DoublyLinkedList {
	private DoublyLinkedList_Node firstNode;
	private DoublyLinkedList_Node lastNode;
	
	public DoublyLinkedList() { firstNode = null; lastNode = null;}

	public DoublyLinkedList_Node getFirstNode() {
		return firstNode;
	}
	
	public void setFirstNode(DoublyLinkedList_Node firstNode) {
		this.firstNode = firstNode;
	}

	public DoublyLinkedList_Node getLastNode() {
		return lastNode;
	}

	public void setLastNode(DoublyLinkedList_Node lastNode) {
		this.lastNode = lastNode;
	}
	
	// 이중 연결리스트 삽입 메서드
	public void insertAtEnd( String value ) {
		DoublyLinkedList_Node newNode = new DoublyLinkedList_Node(value);
		
		// 연결 리스트에 아직 원소가 없을 때
		if( firstNode == null ) {
			firstNode = newNode;
			lastNode = newNode;
		}
		// 연결 리스트에 원소가 하나 이상 있을 때
		else {
			newNode.setpreviousNode( lastNode );
			lastNode.setnextNode( newNode );
			lastNode = newNode;
		}
	}
	// 이중 연결 리스트 가장 앞 노드 삭제 메서드
	public DoublyLinkedList_Node removeFromFront() {
		DoublyLinkedList_Node removedNode = firstNode;
		firstNode = firstNode.getnextNode();
		return removedNode;
	}
		
	@Override
	public String toString() {
		return "DoublyLinkedList [firstNode=" + firstNode + ", lastNode=" + lastNode + "]";
	}
	
	
}
