package coddingProblem.backjoon.categoryProblem.divisorAndPrimeAndMultiple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* 	https://www.acmicpc.net/problem/4134 다음소수
* */
public class DPM_4134 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for( int i = 0; i < T; i++ ) {

			long n = Long.parseLong(br.readLine());

			while( true ){

				boolean isPrime = true;
				// 2부터 루트n까지 나눴을 때 0이 되는 숫자는
				// 소수가 아님.
				for( long j = 2; j*j <= n; j++ ){

					if( n % j == 0){
						isPrime = false;
						break;
					}
				}
				// 0과 1은 소수가 아님
				if( n >= 2 && isPrime) {
					sb.append(n).append("\n");
					break;
				}

				n++;

			}
		}
		System.out.println(sb);
	}
}
