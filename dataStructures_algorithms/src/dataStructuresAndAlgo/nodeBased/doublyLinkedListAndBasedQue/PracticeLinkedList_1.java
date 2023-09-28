package dataStructuresAndAlgo.nodeBased.doublyLinkedListAndBasedQue;
/*
 * 313p 연습 문제 1번
 * 	LinkedList 클래스에 리스트 내 모든 원소를 출력하는 메서드를 추가하기.
 */
public class PracticeLinkedList_1 extends DoublyLinkedList{

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtEnd("안녕");
		list.insertAtEnd("연결");
		list.insertAtEnd("리스트");
		
	}
	// 모든 원소 출력 메서드
	public String printList() {
		String sumElements = "";
		//
		if( super.getFirstNode() == null) return null; 
		DoublyLinkedList_Node node = super.getFirstNode();
		// 다음 노드의 다음 노드가 null일 때까지
		while( node.getnextNode() != null ) {
			
		}
	}
}
