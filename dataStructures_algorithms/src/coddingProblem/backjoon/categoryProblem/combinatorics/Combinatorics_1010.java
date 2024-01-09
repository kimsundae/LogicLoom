package coddingProblem.backjoon.categoryProblem.combinatorics;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
/*
*  https://www.acmicpc.net/problem/1010 다리 놓기
* */
public class Combinatorics_1010 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            BigInteger f_n = new BigInteger(String.valueOf(N)), f_k = new BigInteger(String.valueOf(1));

            for (int i = 1; i < M; i++)
                f_n = f_n.multiply(new BigInteger(String.valueOf(N - i)));

            for (int i = 0; i < M; i++)
                f_k = f_k.multiply(new BigInteger(String.valueOf(M-i)));

            sb.append( f_n.divide(f_k) ).append("\n");

        }

        System.out.println(sb);
    }
}