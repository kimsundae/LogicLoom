package dataStructuresAndAlgo.nodeBased.doublyLinkedListAndBasedQue;
/*
 * 307.p 
 * 		이중 연결 리스트 노드
 */

public class DoublyLinkedList_Node {
	private String data;
	private DoublyLinkedList_Node nextNode;
	private DoublyLinkedList_Node previousNode;
	public DoublyLinkedList_Node() {}
	public DoublyLinkedList_Node(String data) {
		super();
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public DoublyLinkedList_Node getnextNode() {
		return nextNode;
	}
	public void setnextNode(DoublyLinkedList_Node nextNode) {
		this.nextNode = nextNode;
	}
	public DoublyLinkedList_Node getpreviousNode() {
		return previousNode;
	}
	public void setpreviousNode(DoublyLinkedList_Node previousNode) {
		this.previousNode = previousNode;
	}
	@Override
	public String toString() {
		return "DoublyLinkedList_Node [data=" + data + ", nextNode=" + nextNode + ", previousNode=" + previousNode
				+ "]";
	}	
}
