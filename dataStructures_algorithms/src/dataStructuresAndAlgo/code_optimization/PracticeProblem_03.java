package dataStructuresAndAlgo.code_optimization;

import java.util.Arrays;

/*
* 519p 연습 문제 3번
*   예상 주가에서 한 번의 매수 거래와 한 번의 매도 거래로 벌 수 있는 최대 수익 계산하기
* */
public class PracticeProblem_03 {

    public int solve( int[] arr ){
        int max = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0, maxIndex = 0;
        int maxSum = 0;

        for( int i = 0; i < arr.length; i++ ){

            if( min > arr[i] ) {
                min = arr[i];
                minIndex = i;
            }
            if( arr[i] > max || minIndex > maxIndex) {
                max = arr[i];
                maxIndex = i;
            }
            if( max - min > maxSum )
                maxSum = max - min;

        }
        return maxSum;
    }

}
