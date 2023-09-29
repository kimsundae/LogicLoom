package dataStructuresAndAlgo.nodeBased.doublyLinkedListAndBasedQue;

import java.io.IOException;

import dataStructuresAndAlgo.nodeBased.linkedList.Node_;

/*
 * 	313p 연습 문제 5번 
 * 		기본 연결 리스트 중간에 있는 노드에는 접근하지만 연결 리스트 자체에는 접근하지 못한다.
 * 		리스트에서 이 노드를 실질적으로 삭제하는 코드를 작성.
 */
public class PracticeLinkedList_5 extends PracticeLinkedList_4{
	public static void main(String[] args) throws IOException {
		PracticeLinkedList_5 list = new PracticeLinkedList_5();
		int index = 0;
		list.insertAtIndex(index++, "안녕");
		list.insertAtIndex(index++, "반가워");
		list.insertAtIndex(index++, "연결");
		list.insertAtIndex(index++, "리스트");
		list.insertAtIndex(index++, "!!");
		// 풀이를 위한 임시 인스턴스를 얻는다. data : "연결"
		Node_ node = list.getNode().getNextNode().getNextNode();
		//list.deleteSelectNode( node );
		list.deleteMiddleNodeSolution( node );
		list.printList();
		// result : 안녕 반가워 리스트 !!
	}
	// 연습 문제 4번에서 제출했던 풀이와 비슷한 방법을 사용한다.
	public void deleteSelectNode( Node_ node ) {
		String[] valueList = new String[ super.elementsSize() ];
		int index = 0;
		Node_ newNode = node;
		// 매개로 받은 노드의 데이터부터 끝 노드의 데이터를 배열에 담는다.
		while( newNode.getNextNode() != null ) {
			newNode = newNode.getNextNode();
			valueList[ newNode.getNextNode() == null ? index : index++ ] = newNode.getData();
		}
		index = 0;
		// 매개 노드부터 끝 노드까지 데이터를 바꿔준다.
		node.setData( valueList[index++] );
		
		while( node.getNextNode() != null ) {
			// 만약 노드의 다음다음 노드가 null이면 다음 노드의 링크를 null로 바꾼다.
			if( node.getNextNode().getNextNode() == null) 
				node.setNextNode(null);
			node = node.getNextNode();
			if (node == null) return;
			node.setData( valueList[index++] );
		}	
	}
	// 문제 정답.. 너무 간단하다.. 뻘짓 한 것 같다.. 
	// 하나만 덮어씌우고 삭제해주면 해결되므로 뒤의 원소를 옮겨줄 필요가 없다.
	public void deleteMiddleNodeSolution( Node_ node) {
		node.setData( node.getNextNode().getData() );
		node.setNextNode( node.getNextNode().getNextNode() ); 
	}
}
