package dataStructuresAndAlgo.nodeBased.binaryHeap;

import java.util.ArrayList;
import java.util.List;

public class CusHeap<T extends Comparable<T>> {
    private List<T> data;

    public CusHeap(){
        data = new ArrayList<>();
    }
    // 루트 데이터 반환
    public T rootNode(){
        if( !data.isEmpty() )
            return data.get(0);
        else
            return null;
    }
    // 마지막 데이터 반환
    public T lastNode(){
        if( !data.isEmpty() )
            return data.get( data.size()-1 );
        else
            return null;
    }
    // 어떤 노드의 왼쪽 자식을 찾으려면(index * 2) + 1 공식을 사용한다.
    public int leftChildIndex( int index ){
        return (index * 2) + 1;
    }
    // 어떤 노드의 오른쪽 자식을 찾으려면 (index * 2) + 2 공식을 사용한다.
    public int rightChildIndex( int index ){
        return (index * 2) + 2;
    }
    // 어떤 노드의 부모 노드를 찾으려면 (index-1) / 2 공식을 사용한다.
    public int parentIndex( int index ){
        return (index-1) / 2;
    }
    // 힙 삽입 메서드
    public void insert( T value ){
        // value를 배열 끝에 삽입해 마지막 노드로 만든다.
        data.add( value );

        // 새로 삽입한 노드의 인덱스를 저장한다.
        int newNodeIndex = data.size() - 1;

        // 다음 루프는 "위로 트리클링"하는 알고리즘을 실행한다.

        // 새 노드가 루트 자리에 없고
        // 새 노드가 부모 노드보다 크다면
        while( (newNodeIndex > 0) &&
                ( data.get(newNodeIndex)
                        .compareTo(data.get(parentIndex( newNodeIndex ))) > 0 )){
            // 새 부모와 부모 노드를 스왑한다.
            T tmp = data.get(parentIndex( newNodeIndex ) );
            data.set( parentIndex( newNodeIndex ), data.get(newNodeIndex) );
            data.set( newNodeIndex, tmp );

            // 새 노드의 인덱스를 업데이트한다.
            newNodeIndex = parentIndex( newNodeIndex );
        }
    }
}

