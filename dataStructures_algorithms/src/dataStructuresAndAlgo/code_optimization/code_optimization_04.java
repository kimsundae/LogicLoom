package dataStructuresAndAlgo.code_optimization;

import java.util.*;

/*
* 488p 합 교환(sum swap) 문제
* */
public class code_optimization_04 {

    /*
    *  O(N²)대신 O(1)로 최적화하기
    * */
    public List<Integer> sumSwap( List<Integer> arr1, List<Integer> arr2 ){
        // 첫 번째 배열의 값을 저장하는 해시
        Map<Integer, Integer> map = new HashMap();
        int sum1 = 0, sum2 = 0;

        // 첫 번째 배열의 합을 구하면서
        // 각 값을 인덱스와 함께 해시 테이블에 저장한다.
        for( int i = 0; i < arr1.size(); i++ ) {
            sum1 += arr1.get(i);
            map.put(arr1.get(i), i);
        }

        // 두 번째 배열의 합을 구한다.
        for( int i = 0; i < arr2.size(); i++ ){
            sum2 += arr2.get(i);
        }
        // 두 번째 배열 내 숫자가 얼만큼 변해야 하는지
        // 계산한다.
        int shiftAmount = (sum1 - sum2) / 2;

        // 두 번째 배열의 각 숫자를 순회한다.
        for( int i = 0; i < arr2.size(); i++ ){

            // 현재 숫자에 변해야 하는 양을 더한 보수가
            // 첫 번째 배열에 있는지
            // 해시 맵에서 확인한다.
            if( map.containsKey(arr2.get(i)+shiftAmount))
                return new ArrayList<>(Arrays.asList(map.get(arr2.get(i) + shiftAmount),i));
        }
        return null;
    }
}
