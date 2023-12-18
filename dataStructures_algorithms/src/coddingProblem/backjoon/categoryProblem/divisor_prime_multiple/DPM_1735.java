package coddingProblem.backjoon.categoryProblem.divisor_prime_multiple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
*  https://www.acmicpc.net/problem/1735 분수 합
* */
public class DPM_1735 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());

		a *= d;
		c *= b;

		a += c;
		b *= d;

		// 유클리드 호제법
		int temp = 0, gcdA = a, gcdB = b;
		if( gcdB > gcdA ) {
			temp = gcdA;
			gcdA = gcdB;
			gcdB = temp;
		}
		while( gcdB != 0 ){
			temp = gcdA;
			gcdA = gcdB;
			gcdB = temp%gcdB;
		}
		// 최대 공약수로 분자와 분모 나누기
		System.out.println( (a /= gcdA) + " " + (b /= gcdA) );
	}
}
