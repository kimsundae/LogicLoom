package coddingProblem.backjoon.categoryProblem.deepening2;


import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
*  https://www.acmicpc.net/problem/2108 통계학
* */
public class Deepening2_2108 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int manyAppears = 0;

        for( int i = 0; i < N; i++){
            int inputNum = Integer.parseInt(br.readLine());
            sum += inputNum;

            if( min > inputNum )
                min = inputNum;
            if( max < inputNum )
                max = inputNum;

            arr[inputNum+4000]++;
        }

        int[][] newArr = new int[N][2];
        int index = 0;
        for( int i = 0; i < arr.length; i++ ){
            int temp = arr[i];

            if(temp != 0) {
                if( temp > manyAppears ) {
                    manyAppears = temp;
                }

                for( int j = 0; j < temp; j++ ){
                    newArr[index][0] = i-4000;
                    newArr[index][1] = temp;
                    index++;
                }

            }
        }
        int lowest = Integer.MAX_VALUE, nextLowest = Integer.MAX_VALUE;
        for( int i = 0; i < newArr.length; i++){

            if( newArr[i][1] == manyAppears ){

                if( lowest >= newArr[i][0] )
                    lowest = newArr[i][0];
                else if( nextLowest == Integer.MAX_VALUE || nextLowest > newArr[i][0] )
                    nextLowest = newArr[i][0];

            }
        }

        System.out.println( Math.round(sum / (double)N) +"\n"+newArr[N/2][0]+"\n"+ (nextLowest == Integer.MAX_VALUE ? lowest : nextLowest) +"\n"+(max-min));
    }
}