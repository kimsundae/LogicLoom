package coddingProblem.backjoon.categoryProblem.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Recursion_10870 {
    public static int fibonacci(int N){
        if( N == 1 ) return 1;
        else if( N == 0 ) return 0;
        return fibonacci(N-1) + fibonacci(N-2);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(N));
    }
}