package dataStructuresAndAlgo.recursion.dynamicProgramming;

import java.util.HashMap;

/*
 *	257p. 
 * 		골롬 수열(Goleomb sequence)은 수학적 수열의 N번째 수를 계산한다.
 * 		메모이제이션으로 최적화하기
 * 		def golomb(n)
 * 			return 1 if n == 1
 * 			return 1 + golomb(n - golomb(golomb(n - 1 )));
 *		end
 */
public class PracticeProblem_2 {
	public static int golomb( int n , HashMap<Integer , Integer> hash) {
		// 기저조건
		if( n == 1) return 1;
		// 이미 계산된 n이라면 리턴
		if( hash.containsKey(n)) return hash.get(n);
		// 아니라면 해시맵에 추가
		else hash.put(n , golomb( n - 1 , hash ));
		
		return 1 + golomb(n - golomb(golomb( n - 1 , hash ), hash) , hash );
	}
	public static void main(String[] args) {
		int result = golomb(5 , new HashMap<>());
		System.out.println("result : " + result);
		// result == 3
	}
}
