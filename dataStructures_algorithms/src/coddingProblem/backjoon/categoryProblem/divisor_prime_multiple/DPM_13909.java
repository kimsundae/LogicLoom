package coddingProblem.backjoon.categoryProblem.divisor_prime_multiple;


import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
* https://www.acmicpc.net/problem/13909 창문 닫기
* */
public class DPM_13909 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;

        for( int i = 2; i*i <= N; i++ )
            count++;

        System.out.println( count );
    }
}