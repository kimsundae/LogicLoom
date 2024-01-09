package coddingProblem.backjoon.nowSolving;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int manyAppears = 0, manyAppearsIndex = 0;

        for( int i = 0; i < N; i++){
            int inputNum = Integer.parseInt(br.readLine());
            sum += inputNum;

            if( min > inputNum )
                min = inputNum;
            if( max < inputNum )
                max = inputNum;

            arr[inputNum+4000]++;
        }

        int[] newArr = new int[N];
        int index = 0;
        for( int i = 0; i < arr.length; i++ ){
            int temp = arr[i];
            if(temp != 0) {

                if( temp > manyAppears ) {
                    manyAppears = temp;
                    manyAppearsIndex = i-4000;
                }
                newArr[index++] = temp;
            }
        }

        System.out.println( Math.round(sum / (double)N) +"\n"+newArr[N/2]+"\n"+manyAppearsIndex+"\n"+(max-min));
    }
}