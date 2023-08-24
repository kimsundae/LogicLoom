package dataStructuresAndAlgo.recursion.dynamicProgramming;

import java.util.Arrays;

/*	246p. 
 * 	빅 오를 위한 작은 개선
 * 	필요하지 않은 재귀 호출이 포함된다. 딱 한 번만 호출하여, 그 결과를 변수에 저장하여 해결한다.
 */


public class improvementForBigO {
	
	public static int max( int[] arr ) {
		//기저조건
		if(arr.length == 1) {return arr[0];}
		// 인덱스 1부터 끝까지 배열 카피
		int[] copyArr = Arrays.copyOfRange(arr, 1, arr.length);
		// remain에 최대값 저장 
		int remain = max(copyArr);
		// 최대값이 앞선 0번째 인덱스 값보다 작으면 arr[0]반환 크면 remain 반환
		if( arr[0] > remain )return arr[0];
		else return remain;
	}
	
	public static void main(String[] args) {
		int[] array = { 5, 8, 3, 11, 6, 2 };
        int maxValue = max(array);
        System.out.println("Maximum value: " + maxValue);
        // maxValue == 11
	}

}
