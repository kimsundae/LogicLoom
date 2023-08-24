package dataStructuresAndAlgo.recursion.dynamicProgramming;

import java.util.HashMap;

/*
 * 252p.
 * 메모이제이션 구현
 * 
 */
public class Memoization {
	
	public static int fib( int n , HashMap<Integer , Integer> memo) {
		//기저조건
		if(n == 0 || n == 1)return n;
		// n에 해당하는 key값이 있다면 value를 반환
		if(memo.containsKey(n)) return memo.get(n);
		// 없다면 저장
		else
			memo.put( n , fib(n-1 , memo) + fib(n-2 , memo) );
		// 이제 n에 해당하는 key값이 확실히 생겼으므로 반환
		return memo.get(n);	
	}
	
	public static void main(String[] args) {
		System.out.println(fib( 6 , new HashMap<>()));
	}
	
}
