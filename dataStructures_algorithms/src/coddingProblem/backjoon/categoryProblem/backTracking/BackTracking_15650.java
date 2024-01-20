package coddingProblem.backjoon.categoryProblem.backTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
*  https://www.acmicpc.net/problem/15650 N과 M (2)
* */
public class BackTracking_15650 {
    static int M;
    static int N;
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];
    static StringBuilder sb = new StringBuilder();
    public static void solve( int index, int k ){
        if( index == M ){

            for( int i = 0; i < M; i++ )
                sb.append(arr[i]).append(" ");

            sb.append("\n");
            return;
        }
        for( int i = k; i <= N; i++ ){
            if( !isUsed[i] ){
                arr[index] = i;
                isUsed[i] = true;
                solve(index+1, k+1);
                isUsed[i] = false;
            }
        }

    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        solve( 0, 1 );

        System.out.println(sb);

    }
}