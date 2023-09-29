package dataStructuresAndAlgo.nodeBased.doublyLinkedListAndBasedQue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import dataStructuresAndAlgo.nodeBased.linkedList.LinkedList;
import dataStructuresAndAlgo.nodeBased.linkedList.Node_;

/*
 * 313p 연습 문제 4번
 * 	기본 LinkedList 클래스에 리스트를 거꾸로 뒤집는 메서드를 추가.
 */
public class PracticeLinkedList_4 extends LinkedList{
	public static void main(String[] args) throws IOException {
		PracticeLinkedList_4 list = new PracticeLinkedList_4();
		int index = 0;
		list.insertAtIndex(index++, "안녕");
		list.insertAtIndex(index++, "연결");
		list.insertAtIndex(index++, "리스트");
		list.reverseListSolution();
		list.printList();
		// result : 리스트 연결 안녕
	}
	// 모든 원소 출력 메소드
	public void printList() throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Node_ node = super.getNode();
		bw.write( node.getData() + " " );
		while( node.getNextNode() != null ) {
			node = node.getNextNode();
			bw.write(node.getData() + " ");
		}
		bw.flush();
	}
	// 리스트 배열 내 총 원소 개수 
	public int elementsSize() {
		Node_ node = super.getNode();
		int sum = 0;
		// 만약 첫 번째 노드의 데이터가 null이면 0 반환
		if(node.getData() == null) return sum;
		sum++;
		while( node.getNextNode() != null ) {
			node = node.getNextNode();
			sum++;
		}
		// sum 반환
		return sum;
	}
	// 리스트를 거꾸로 뒤집기
	public void reverseList() {	
		String[] valueList = new String[this.elementsSize()];
		int index = 0;
		if( valueList.length == 0 ) return;
		Node_ node = super.getNode();
		valueList[index++] = node.getData();
		
		while( node.getNextNode() != null ) {
			System.out.println(index);
			node = node.getNextNode();			
			valueList[ node.getNextNode() == null ? index : index++] = node.getData();
		}
		// 다시 첫번째 노드를 가리킨다.
		node = super.getNode();
		node.setData( valueList[index--] );
		while( node.getNextNode() != null ) {
			node = node.getNextNode();
			node.setData(valueList[index--]);
		}						
	}

	public void reverseListSolution() {
		// 이전 노드
		Node_ previousNode = null;
		// 현재 노드
		Node_ currentNode = super.getNode();
		// 다음 노드
		Node_ nextNode;
		// 임시 노드
		Node_ tempNode;
		while( currentNode != null ) {
			nextNode = currentNode.getNextNode();
			
			currentNode.setNextNode(previousNode); 
				
			previousNode = currentNode;
			currentNode = nextNode;
			
		}
		super.setNode(previousNode);
	}
}
