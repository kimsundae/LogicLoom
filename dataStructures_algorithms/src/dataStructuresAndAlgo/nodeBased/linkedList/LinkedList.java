package dataStructuresAndAlgo.nodeBased.linkedList;
/*
 * 292p 연결 리스트 구현
 */

public class LinkedList {
    public static void main(String[] args) {
    	Node_ node1 = new Node_("once");
    	Node_ node2 = new Node_("upon");
    	Node_ node3 = new Node_("a");
    	Node_ node4 = new Node_("time");

        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        
        FirstNode list = new FirstNode( node1 );
    }
}

class Node_ {
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

class FirstNode{
	
	private Node_ node;
	public FirstNode( Node_ node) {
		this.node = node;
	}
	public Node_ getNode() {
		return node;
	}
	public void setNode(Node_ node) {
		this.node = node;
	}
}


