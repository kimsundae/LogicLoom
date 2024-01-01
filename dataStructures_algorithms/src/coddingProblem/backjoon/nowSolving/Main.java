package coddingProblem.backjoon.nowSolving;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int f_n = N, f_k = 1;

        for( int i = 1; i < K; i++ )
            f_n *= (N - i);

        for (int i = 0; i < K; i++)
            f_k *= K - i;

        System.out.println( K == 0 ? 1 : f_n/f_k);
    }
}