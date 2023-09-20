package dataStructuresAndAlgo.nodeBased.linkedList;
/*
 * 292p 연결 리스트 구현
 */

public class LinkedList_Ex1 {
    public static void main(String[] args) {
    	Node_ node1 = new Node_("once");
    	Node_ node2 = new Node_("upon");
    	Node_ node3 = new Node_("a");
    	Node_ node4 = new Node_("time");

        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        
        LinkedList list = new LinkedList( node1 );
        // linkedList 검색은 배열과 달리 O(N)단계가 걸린다.
        // once
        System.out.println( list.read(0));
        // 2
        System.out.println( list.indexOf("a"));        
        list.insertAtIndex(3, "purple");
        // purple
        System.out.println(list.read(3));
        list.setNode(node2);
        // upon
        System.out.println( list.read(0));
        
    }
}


