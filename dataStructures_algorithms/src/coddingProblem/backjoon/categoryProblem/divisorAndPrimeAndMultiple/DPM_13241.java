package coddingProblem.backjoon.categoryProblem.divisorAndPrimeAndMultiple;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* https://www.acmicpc.net/problem/13241 최소공배수(유클리드 호제법)
* */
public class DPM_13241 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long longA = Long.parseLong(st.nextToken());long longB = Long.parseLong(st.nextToken()), a = longA, b = longB, temp;

		while( b != 0 ){

			temp = a % b;
			a = b;
			b = temp;

		}
		System.out.println(longA * longB / a);
	}
}
