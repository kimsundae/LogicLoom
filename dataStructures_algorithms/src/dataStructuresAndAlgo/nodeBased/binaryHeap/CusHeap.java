package dataStructuresAndAlgo.nodeBased.binaryHeap;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class CusHeap<T extends Comparable<T>> {
    private List<T> data;

    public CusHeap(){
        data = new ArrayList<>();
    }
    /*
    * 루트 데이터 반환
    * */
    public T rootNode(){
        if( !data.isEmpty() )
            return data.get(0);
        else
            return null;
    }
    /*
    * 마지막 데이터 반환
    * */
    public T lastNode(){
        if( !data.isEmpty() )
            return data.get( data.size()-1 );
        else
            return null;
    }
    /*
    * 순회
    * */
    public void printHeap() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        data.forEach( r -> {
            try {
                bufferedWriter.write( r + "\n" );
            } catch (IOException e) {throw new RuntimeException(e); }});
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    /*
    * 어떤 노드의 왼쪽 자식을 찾으려면(index * 2) + 1 공식을 사용한다
    * 어떤 노드의 오른쪽 자식을 찾으려면 (index * 2) + 2 공식을 사용한다.
    * 어떤 노드의 부모 노드를 찾으려면 (index-1) / 2 공식을 사용한다.
    * */
    public int leftChildIndex( int index ){
        return (index * 2) + 1;
    }
    public int rightChildIndex( int index ){
        return (index * 2) + 2;
    }
    public int parentIndex( int index ){
        return (index-1) / 2;
    }
    /*
    * 힙 삽입 메서드
    * */
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
    /*
    * 힙 삭제 메서드
    * */
    public void delete(){
        // 힙에서는 루트 노드만 삭제하므로
        // 배열에서 마지막 노드를 팝해 루트 노드로 넣는다.
        data.set( 0, data.remove( data.size()-1 ) );
        // "트리클 노드"의 현재 인덱스를 기록한다.
        int tricleNodeIndex = 0;

        // 다음 루프는 "아래로 트리클링"하는 알고리즘을 수행한다.
        // 트리클 노드에 자기보다 큰 자식이 있으면 루프를 실행한다.
        while( hasGreaterChild(tricleNodeIndex) ){
            int largerChildIndex = calculateLargerChildIndex( tricleNodeIndex );

            // 트리클 노드와 더 큰 자식을 스왑한다.
            T temp = data.get(largerChildIndex);
            data.set( largerChildIndex, data.get(tricleNodeIndex) );
            data.set( tricleNodeIndex, temp );

            // 트리클 노드의 새 인덱스를 업데이트한다.
            tricleNodeIndex = largerChildIndex;
        }
    }
    /*
    * 자신보다 더 큰 자식을 찾는 메서드
    * */
    public boolean hasGreaterChild( int index ){
        // index에 있는 노드에 왼쪽 자식이나 오른쪽 자식이 있는지
        // 어느 한 자식이라도 index에 있는 노드보다 큰지 확인한다.
        return ((data.get(leftChildIndex(index)) != null) && (data.get(leftChildIndex(index)).compareTo(data.get(index)) > 0)) ||
                ((data.get(rightChildIndex(index)) != null) && (data.get(rightChildIndex(index)).compareTo(data.get(index)) > 0));
    }
    /*
    * 더 큰 자식의 인덱스를 반환하는 메서드
    * */
    public int calculateLargerChildIndex( int index ){
        // 오른쪽 자식이 없으면
        if ( data.get( rightChildIndex(index) ) == null ){
            // 왼쪽 자식의 인덱스를 반환한다.
            return leftChildIndex(index);
        }

        // 오른쪽 자식의 값이 왼쪽 자식의 값보다 크면
        if( data.get( rightChildIndex(index) ).compareTo( data.get( leftChildIndex(index)) ) > 0 ){
            // 오른쪽 자식 인덱스 반환
            return rightChildIndex(index);
        }
        // 왼쪽 자식의 값이 오른쪽 자식의 값보다 크거나 같으면
        else
            // 왼쪽 자식의 인덱스 반환
            return leftChildIndex(index);
    }

}

