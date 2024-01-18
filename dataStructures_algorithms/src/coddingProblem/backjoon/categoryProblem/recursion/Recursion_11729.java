package coddingProblem.backjoon.categoryProblem.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
*  하노이 탑 이동 순서
* */
public class Recursion_11729 {

    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    public static void hanoi( int N, int from, int sub, int to ){
        count++;
        if( N == 1 ){
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }
        hanoi( N-1, from, to, sub );
        sb.append(from).append(" ").append(to).append("\n");
        hanoi( N-1, sub, from, to);

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        hanoi( N, 1, 2, 3 );
        System.out.println(count + "\n" + sb.toString());

    }
}