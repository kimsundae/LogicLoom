package coddingProblem.backjoon.nowSolving;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] realPrime = new int[N];

        for( int i = 0; i < N; i++ )
            realPrime[i] = Integer.parseInt(st.nextToken());


        Arrays.sort(realPrime);

        System.out.println( N == 1 ? realPrime[0] * realPrime[0] : realPrime[0] * realPrime[realPrime.length-1] );

    }
}