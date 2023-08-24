package dataStructuresAndAlgo.recursion.dynamicProgramming;

import java.util.Arrays;

/* 
 * 256p. 연습문제 
 * 		1. 주어지는 함수의 불필요한 재귀 호출을 없애기 
 * 
 * 		def add_until_100(array)
 * 			return 0 if array.length == 0
 * 			if array[0] + add_until_100(array[1, array.length - 1]) > 100
 * 				return add_until_100(array[1, array.length - 1])
 * 			else
 * 				return array[0] + add_until_100(array[1, array.length - 1])
 * 			end
 * 		end
 */
public class PracticeProblem_1 {
	
	public static int add_until_100( int[] array ) {
		// 기저조건
		if( array.length == 0)return 0;
		// 배열을 복사한다. 범위는 1부터 마지막 인덱스까지.
		int[] copyArr = Arrays.copyOfRange(array, 1, array.length);
		// 변수에 재귀의 결과를 저장한다.
		int result = add_until_100(copyArr); 
		
		if( array[0] + result > 100) return result;
		else return array[0] + result;
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] { 40 , 30 , 60 , 10 , 20}; 
		int result = add_until_100( arr );
		System.out.println("result : " + result);
		// 90
		
	}
}
