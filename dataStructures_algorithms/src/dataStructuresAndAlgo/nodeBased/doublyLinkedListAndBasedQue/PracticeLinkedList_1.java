package dataStructuresAndAlgo.nodeBased.doublyLinkedListAndBasedQue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 313p 연습 문제 1번
 * 	LinkedList 클래스에 리스트 내 모든 원소를 출력하는 메서드를 추가하기.
 */
public class PracticeLinkedList_1 extends DoublyLinkedList{

	public static void main(String[] args) throws IOException {
		PracticeLinkedList_1 list = new PracticeLinkedList_1();
		list.insertAtEnd("안녕");
		list.insertAtEnd("연결");
		list.insertAtEnd("리스트");
		list.printList();
		// result : 안녕 연결 리스트
	}
	// 모든 원소 출력 메서드
	public void printList() throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		// 첫번째 노드가 null이면 메서드 리턴
		if( super.getFirstNode() == null) return; 
		
		DoublyLinkedList_Node node = super.getFirstNode();
		bw.write( node.getData() + " ");
		// 노드의 다음 노드가 null일 때까지
		while( node.getnextNode() != null ) {			
			node = node.getnextNode();
			bw.write( node.getData() + " ");	
		}
		bw.flush();
	}
}
