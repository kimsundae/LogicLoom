package dataStructuresAndAlgo.recursion.moreFastReAlgo;
/*
 * 287. 주어진 함수는 정수 배열에서 "빠진 숫자를" 찾는다. O(N²)짜리 구현이다.
 * 	function findMissingNumber(array){
 * 		for(let i = 0; i < array.length; i++) {
 * 			if(!array.includes(i)){
 * 				return i;
 * 			}
 * 		}
 * 	
 * 		return null;
 * }
 * 	정렬을 사용해 O(NlogN)이 걸리도록 함수를 새롭게 작성.
 * 
 */
public class PracticeProblem_2 {
	public static void main(String[] args) {
		int[] arr = new int[] { 9, 3, 2, 5, 6, 7, 1, 0, 4};
		
		int reuslt = findMissingNumber( arr );
		if( reuslt == -1) 
			System.out.println("notFound");
		else
			System.out.println(reuslt);
		
	}
	public static int findMissingNumber( int[] arr ) {
		QuickSort quickSort = new QuickSort(arr);
		quickSort.quickSort(0, quickSort.getArray().length-1);
		arr = quickSort.getArray();
		
		for(int i = 0; i < arr.length-1; i++) {
			if( arr[i] != arr[i+1] && arr[i+1] != arr[i]+1 ) {
				return arr[i]+1;
			}
		}
		return -1;
	}
}
