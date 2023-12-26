package dataStructuresAndAlgo.code_optimization.space_constraints;

import java.util.ArrayList;
import java.util.List;

/*
* 475p 연습문제 3번
*   추가 공간을 O(1)만 사용해 배열을 역순으로 반환하는 새 함수를 생성.
* */
public class PracticeProblem_03 {
    /*
    * 연습문제 2번의 함수
    * */
    public List<Integer> reverse( List<Integer> array ){
        List<Integer> newArray = new ArrayList<>();
        for( int i = array.size() - 1; i >= 0; i-- ){
            newArray.add(array.get(i));
        }
        return newArray;
    }
    /*
    * 추가 공간을 O(1)만 사용하는 함수. O(1)은 추가 공간을 사용하지 않는다.
    * */
    public List<Integer> newReverse( List<Integer> array ){

        for( int i = 1; i <= array.size()/2; i++ ){
            int temp = array.get(i-1);
            array.set(i-1, array.get(array.size()-i));
            array.set(array.size()-i, temp );
        }
        return array;
    }


}
