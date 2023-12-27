package dataStructuresAndAlgo.code_optimization;

import java.util.HashSet;
import java.util.Set;

/*
* 519p 연습 문제 6번
*   [10, 5, 12, 3, 55, 30, 4, 11, 2] 같은 배열이 주어졌을 때
*   가장 긴 연속 순열의 길이를 반환
* */
public class PracticeProblem_06 {

    public int solve( int[] arr ){

        Set<Integer> set = new HashSet<>();
        int maxSize = 0;

        for( int i = 0; i < arr.length; i++ )
            set.add(arr[i]);

        for( int i = 0; i < arr.length; i++ ){

            int nowNum = arr[i];
            int size = 1;
            while(true){
                if( set.contains(nowNum+1) ){
                    size++;
                    nowNum += 1;
                }
                else
                    break;
            }
            if( size > maxSize )
                maxSize = size;
        }
        return maxSize;
    }
}
