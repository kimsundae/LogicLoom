package dataStructuresAndAlgo.space_constraints;

import java.util.ArrayList;
import java.util.List;

/*
* 475p 연습문제 4번
*   숫자로 된 배열을 받아 각 숫자에 2를 곱한 배열을 반환하는 세 가지 서로 다른 함수 구현의
*   시간과 공간 효율성을 나타내기.
* */
public class PracticeProblem_04 {
    // 새로운 배열 생성하는 메서드
    public List<Integer> doubleArray1( List<Integer> array ){
        List<Integer> newArray = new ArrayList<>();
        for( int i = 0; i < array.toArray().length; i++ ){
            newArray.add(array.get(i) * 2);
        }
        return newArray;
    }
    // 새로운 배열 생성하지 않는 메서드
    public List<Integer> doubleArray2( List<Integer> array ){
        for( int i = 0; i < array.toArray().length; i++ ){
            array.set(i, array.get(i)*2);
        }
        return array;
    }
    // 재귀 사용
    public List<Integer> doubleArray3( List<Integer> array, int index ){
        if( index >= array.size() ) return array;

        array.set(index, array.get(index)*2);
        doubleArray3( array, index++ );

        return array;
    }

    /*              시간 복잡도      공간 복잡도
    * 버전 1          O(N)            O(N)
    *
    * 버전 2          O(N)            O(1)
    *
    * 버전 3          O(N)            O(N)
    *
    * */
}
