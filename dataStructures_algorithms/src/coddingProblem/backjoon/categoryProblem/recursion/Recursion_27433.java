package coddingProblem.backjoon.categoryProblem.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
* https://www.acmicpc.net/problem/27433 팩토리얼2
* */
public class Recursion_27433 {
    public static long factorial( int N ){
        if( N == 1 || N == 0 )
            return 1;
        return N * factorial(N-1);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(factorial(Integer.parseInt(br.readLine())));
    }
}