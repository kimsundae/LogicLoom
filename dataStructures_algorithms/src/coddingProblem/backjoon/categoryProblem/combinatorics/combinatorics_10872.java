package coddingProblem.backjoon.categoryProblem.combinatorics;


import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
* https://www.acmicpc.net/problem/10872 팩토리얼 10872
* */
public class combinatorics_10872 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if( N == 0 || N == 1 )
            System.out.println(1);
        else{
            int sum = 1;
            for( int i = 0; i < N; i++ )
                sum *= N-i;
            System.out.println(sum);
        }
    }
}