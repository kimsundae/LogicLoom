package dataStructuresAndAlgo.recursion.moreFastReAlgo;

public class Ex4_hasDuplicateValue {
	public static boolean hasDuplicateValue( int[] array ) {
		// 배열을 정렬한다.		
		// Arrays.sort(array);
		QuickSort quickSort = new QuickSort(array);
		quickSort.quickSort(0, array.length-1);
		
		// 배열의 각 값을 마지막 값까지 순회한다.
		for(int i = 0; i < array.length-1; i++) {
			
			// 현재 값이 배열의 다음 값과 같다면.
			if( array[i] == array[i+1] )
				return true;
		}
		// 중복 없음
		return false;
	}
	
	public static void main(String[] args) {
		int[] array1 = new int[] {0, 5, 2, 1, 6, 3};
		boolean result1 = hasDuplicateValue( array1 );
		System.out.println("result : " + result1);
		// -------------------------------------------//
		int[] array2 = new int[] {0, 5, 2, 1, 5, 3};
		boolean result2 = hasDuplicateValue( array2 );
		System.out.println("result : " + result2);
	}
}
