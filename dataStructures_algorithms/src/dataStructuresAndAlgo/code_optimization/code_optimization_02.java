package dataStructuresAndAlgo.code_optimization;

import java.util.*;

/*
* 484p 두 수의 합(two-sum) 문제
* */
public class code_optimization_02 {
    /*
    * [2, 0, 4, 1, 7, 9] 두 수를 합해 10이 되는 수가 배열에 있는지
    * 알아보는 함수
    * */
    // 최적화 전 O(N²)
    public boolean twoSum( int[] array ){
        for( int i = 0; i < array.length; i++ ){
            for( int j = 0; j < array.length; j++ ){
                if( i != j && array[i] + array[j] == 10 )
                    return true;
            }
        }
        return false;
    }
    // 최적화 O(N)
    public boolean twoSum2( int[] array ){
        Set<Integer> set = new HashSet<>();

        for( int i = 0; i < array.length; i++ ){
            // 현재 숫자와 더했을 때 합해서 10이 되는 숫자가
            // 해시에 있는지 확인한다.
            if( set.contains(10 - array[i]) )
                return true;

            // 각 숫자를 set에 저장한다.
            set.add(array[i]);
        }
        // 어떤 숫자의 보수도 찾지 못한 채
        // 배열 끝에 도달했으면 false를 반환한다.
        return false;
    }
}
