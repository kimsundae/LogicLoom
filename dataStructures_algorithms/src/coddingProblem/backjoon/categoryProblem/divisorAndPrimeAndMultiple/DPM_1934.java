package coddingProblem.backjoon.categoryProblem.divisorAndPrimeAndMultiple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* https://www.acmicpc.net/problem/1934 최소공배수
* */
public class DPM_1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for( int i = 0; i < T; i++ ){
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int sum = 1;

			main : for(int j = 2; j <= (Math.min(A, B)); j++ ){

				if( A % j == 0 && B % j == 0 ){
					A /= j; B /= j;
					sum *= j;
					j = 1;
				}

			}
			sb.append(A*B*sum).append("\n");
		}
		System.out.println(sb);
	}
}
