package dataStructuresAndAlgo.code_optimization;

/*
* 519p 연습 문제 5번
*   [98.6, 98.0, 97.1, 99.0, 98.9, 97.8, 98.5, 98.2, 98.0, 97.1]
*       97도부터 99도까지 O(N)으로 정렬하기
*
* */
public class PracticeProblem_05 {

    public float[] solve( float[] arr ){
        // 97부터 99도까지
        int[] sortArr = new int[20];

        for( int i = 0; i < arr.length; i++ ){
            sortArr[ (int)(arr[i] * 10 - 970) ]++;
        }

        int index = 0;
        for( int i = 0; i < sortArr.length; i++ ){
            if( sortArr[i] != 0 ){

                while(sortArr[i]-- > 0){
                    arr[index++] = (970 + i)/10.0f;
                }
            }
        }
        return arr;
    }

}
