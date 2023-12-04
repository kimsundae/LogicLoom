package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int[] cards = new int[20000001];

		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");

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
