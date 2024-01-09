package coddingProblem.backjoon.nowSolving;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
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