package dataStructuresAndAlgo.nodeBased.doublyLinkedList;

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

	@Override
	public String toString() {
		return "DoublyLinkedList [firstNode=" + firstNode + ", lastNode=" + lastNode + "]";
	}
	
	
}
