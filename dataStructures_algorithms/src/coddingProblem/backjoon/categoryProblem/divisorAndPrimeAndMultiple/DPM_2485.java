package coddingProblem.backjoon.categoryProblem.divisorAndPrimeAndMultiple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* https://www.acmicpc.net/problem/2485 가로수
* */
public class DPM_2485 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		// 총 가로수 개수
		int N = Integer.parseInt(br.readLine());
		// 가로수 위치
		int[] location = new int[N];
		// 처음과 끝에 심어져있는 가로수 위치
		int firstTree,lastTree;
		// 간격의 최대 공약수
		int division = 1;
		// 총 가로수 수
		int count = 0;

		for( int i = 0; i < N; i++ ){
			int num = Integer.parseInt(br.readLine());
			location[i] = num;

		}

		firstTree = location[0];lastTree = location[N-1];

		// 간격 구한 후 대입
		for( int i = 0; i < N-1; i++ ){
			location[i] = location[i+1] - location[i];
		}


		// 최대 공약수 구하기
		for( int i = 2; i <= location[0]; i++ ){

			boolean hasDivision = true;

			for( int j = 0; j < N-1; j++ ){

				if( location[j] % i != 0 ){
					hasDivision = false;
					break;
				}
			}

			// 공약수를 가졌다면 현재 공약수를 i로 저장
			// 루프 중 마지막에 저장된 값이 최대공약수
			if( hasDivision )
				division = i;

		}
		int i = firstTree;
		while( lastTree >= i ){
			count++;
			i += division;
		}
		// 결과 출력
		// 총 가로수 수 - 현재 가로수 수
		System.out.println(count - N);
	}
}
