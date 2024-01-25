package coddingProblem.backjoon.categoryProblem.backTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
* https://www.acmicpc.net/problem/9663 N-Queen
* */
public class BackTracking_9663 {
    static int N;
    static int count = 0;
    static int[] select;

    public static boolean match( int col, int row ){

        for( int i = 0; i < row; i++ ){

            if( select[i] == col )
                return false;

            if( i + select[i] == col+row )
                return false;

            int temp = row - i;
            if( row - temp == i && col - temp == select[i] )
                return false;

        }
        return true;
    }
    public static void solve( int col, int row, int depth ){
        if( row >= N-1 ) {
            count++;
            return;
        }
        for( int i = 0; i < N; i++){

            if(match(i, row+1)) {
                select[row + 1] = i;
                solve(i, row + 1, depth+1);
            }

        }

    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt( br.readLine() );
        select = new int[N];
        solve( 0, -1, -1);
        System.out.println(count);
    }
}