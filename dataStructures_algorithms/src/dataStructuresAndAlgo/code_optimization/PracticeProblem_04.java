package dataStructuresAndAlgo.code_optimization;

/*
* 519p 연습 문제 4번
*   [5, -10, -6, 9, 4] O(N)이 걸리는
*   두 숫자 간 최대 곱을 계산하는 함수 구하기
*
* */
public class PracticeProblem_04 {

    public int solve(int[] arr){
        /*
        * 음수와 양수의 곱은 최댓값이
        * 나올 수 없음 둘을 구별하여 변수에 저장
        * */
        int maxPlus = 0, nextMaxPlus = 0;
        int maxMinus = Integer.MIN_VALUE, nextMaxMinus = 0;

        for( int i = 0; i < arr.length; i++ ){

            if( arr[i] > 0 ){
                if( arr[i] > maxPlus ){
                    nextMaxPlus = maxPlus;
                    maxPlus = arr[i];
                }else if( arr[i] > nextMaxPlus ){
                    nextMaxPlus = arr[i];
                }
            }
            else{
                if( maxMinus > arr[i] ) {
                    nextMaxMinus = maxMinus;
                    maxMinus = arr[i];
                }else if( nextMaxMinus > arr[i] ){
                    nextMaxMinus = arr[i];
                }
            }
        }

        return maxPlus * nextMaxMinus > maxMinus * nextMaxMinus ?
                    maxPlus * nextMaxPlus : maxMinus * nextMaxMinus;
    }
}
