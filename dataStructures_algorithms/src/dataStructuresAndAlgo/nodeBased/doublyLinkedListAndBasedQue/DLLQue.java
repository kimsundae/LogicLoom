package dataStructuresAndAlgo.nodeBased.doublyLinkedListAndBasedQue;
/*
 * 309p
 * 		이중 연결 리스트 기반 큐
 */
public class DLLQue {
	private DoublyLinkedList data;
	
	public DLLQue() {
		this.data = new DoublyLinkedList();
	}
	// 원소 삽입 메서드 인큐
	public void enque( String element ) {
		data.insertAtEnd( element );
	}
	// 원소 삭제 메서드 디큐
	public String deque(){
		DoublyLinkedList_Node removedNode = data.removeFromFront();
		return removedNode.getData();
	}
	// 가장 앞 원소 정보 읽기
	public String read() {
		if( data.getFirstNode() == null ) return null;
		return data.getFirstNode().getData();
		
	}
}
