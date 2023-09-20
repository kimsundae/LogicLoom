package dataStructuresAndAlgo.nodeBased.linkedList;

public class Node_ {
	private String data;
	private Node_ nextNode;

	public Node_(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node_ getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node_ nextNode) {
		this.nextNode = nextNode;
	}
}
