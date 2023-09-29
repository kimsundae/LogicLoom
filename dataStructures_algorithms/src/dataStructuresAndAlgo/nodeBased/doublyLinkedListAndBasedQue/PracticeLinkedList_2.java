package dataStructuresAndAlgo.nodeBased.doublyLinkedListAndBasedQue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 *	313p 연습문제 2번
 *		DoublyLinkedList 클래스에 리스트 내 모든 원소를 거꾸로 출력하는 메서드 추가. 
 */
public class PracticeLinkedList_2 extends DoublyLinkedList{

	public static void main(String[] args) throws IOException {
		PracticeLinkedList_2 list = new PracticeLinkedList_2();
		list.insertAtEnd("안녕");
		list.insertAtEnd("링크드");
		list.insertAtEnd("리스트");
		list.reversePrint();
		// result : 리스트 링크드 안녕
	}
	public void reversePrint() throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DoublyLinkedList_Node node = super.getLastNode();
		bw.write( node.getData() + " " );
		while( node.getpreviousNode() != null ) {
			node = node.getpreviousNode();
			bw.write( node.getData() + " " );
		}
		bw.flush();
	}
}
