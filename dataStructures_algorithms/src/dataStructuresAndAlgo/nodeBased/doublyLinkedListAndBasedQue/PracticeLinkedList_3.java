package dataStructuresAndAlgo.nodeBased.doublyLinkedListAndBasedQue;

import dataStructuresAndAlgo.nodeBased.linkedList.LinkedList;
import dataStructuresAndAlgo.nodeBased.linkedList.Node_;

/*
 * 	313p 연습문제 3번
 * 		기본 LinkedList 클래스에 리스트의 마지막 원소를 반환하는 메서드를 추가.
 */
public class PracticeLinkedList_3 extends LinkedList{
	public static void main(String[] args) {
		PracticeLinkedList_3 list = new PracticeLinkedList_3();
		int index = 0;
		list.insertAtIndex(index++, "안녕" );
		list.insertAtIndex(index++, "연결");
		list.insertAtIndex(index++, "리스트");
		System.out.println( list.lastValue() );
	}
	public String lastValue() {
		Node_ node = super.getNode();
		if( node.getData() == null )return null;
		
		// 노드의 다음 노드가 null일 때까지 다음 노드를 링크한다.
		while( node.getNextNode() != null ) {
			node = node.getNextNode();
		}
		// 다음 노드가 null이면 마지막 노드이므로 데이터를 리턴한다.
		return node.getData();
	}
}
