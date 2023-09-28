package dataStructuresAndAlgo.nodeBased.doublyLinkedList;

public class DoublyLinkedList_Node {
	private String data;
	private DoublyLinkedList_Node nextNode;
	private DoublyLinkedList_Node previousNode;
	public DoublyLinkedList_Node() {}
	public DoublyLinkedList_Node(String data, DoublyLinkedList_Node nextNode, DoublyLinkedList_Node previousNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
		this.previousNode = previousNode;
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
