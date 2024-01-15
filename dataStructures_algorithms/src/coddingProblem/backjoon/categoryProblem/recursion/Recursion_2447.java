package coddingProblem.backjoon.categoryProblem.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
* https://www.acmicpc.net/problem/2447 별 찍기 - 10
* */
public class Recursion_2447 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for( int i = 0; i < N; i++ ){

            for( int j = 0; j < N; j++ ){
                int tempRow = i;
                int tempHigh = j;
                int tempN = N;
                if( tempRow%3 == 1 && tempHigh%3 == 1 ) {
                    sb.append(' ');
                }else{
                    while( true ){
                        tempRow %= tempN; tempHigh %= tempN;
                        tempN /= 3;
                        if( 3 > tempRow || 3 > tempHigh) {
                            sb.append('*');
                            break;
                        }
                        if( (tempN*2-1 >= tempRow && tempRow >= tempN) && (tempN*2-1 >= tempHigh && tempHigh >= tempN )) {
                            sb.append(' ');
                            break;
                        }
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}