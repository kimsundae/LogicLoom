package dataStructuresAndAlgo.recursion.moreFastReAlgo;
/*
 * 287p
 * 	1. 	양수 배열이 주어졌을 때, 
 * 		세 수의 가장 큰 곱을 반환하는 함수를 
 * 		정렬을 사용해 O(NlogN)의 속도로 계산하도록 함수 작성. 
 * 
 * 
 * 
 */
public class PracticeProblem_1 {

	public static void main(String[] args) {
		// 배열을 오름차순으로 정렬한다면 
		// 가장 오른쪽 세개의 수는 가장 큰 곱
		int[] arr = new int[] { 9, 3, 2, 5, 6, 7, 1, 4};
		QuickSort quickSort = new QuickSort(arr);
		quickSort.quickSort( 0, arr.length-1 );
		arr = quickSort.getArray();
		
		System.out.println( "result : " + (arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3] ));
		// result : 378
	}
}
