package coddingProblem.backjoon.categoryProblem.setAndMap;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* 	https://www.acmicpc.net/problem/10816 숫자 카드 2
* */
public class SetAndMap_10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		// 수의 범위 -10000000 ~ 10000000까지
		int[] cards = new int[20000001];

		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");

		// 음수가 존재하므로 0부터 200000001까지
		while( st.hasMoreTokens() ){
			cards[ Integer.parseInt( st.nextToken() ) + 10000000  ]++;
		}

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");

		while( st.hasMoreTokens() ){
			int number = Integer.parseInt( st.nextToken() );
			sb.append(cards[  number + 10000000 ]).append(" ");
		}

		System.out.println(sb);

	}
}
