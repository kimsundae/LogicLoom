package dataStructuresAndAlgo.recursion.moreFastReAlgo;

/*
 * 287.
 * 		배열에서 가장 큰 수를 찾는 함수 세 개를 각각 O(N²), O(NlogN), O(N)으로 작성.
 */
public class PracticeProblem_03 {
	public static void main(String[] args) {
		int[] arr = new int[] {9, 3, 2, 5, 6, 7, 1, 0, 4};
		System.out.println(findHighNumber_N_2(arr));
		
	}
	// O(N²)
	public static int findHighNumber_N2( int[] arr ) {
		
		for( int i = 0; i < arr.length; i++) {
			boolean result = false;
			for( int j = 0; j < arr.length; j++) {
				if(arr[i] > arr[j]) 
					result = true;	
			}
			if(result)
				return arr[i];
		}
		return -1;
	}

	//O(NlogN)
	public static int findHighNumber_NlogN( int[] arr ) {
		QuickSort quickSort = new QuickSort(arr);
		quickSort.quickSort( 0, quickSort.getSize() -1 );
		return quickSort.getArray()[quickSort.getSize()-1];	 
	}
	// O(N)
	public static int findHighNumber_N( int[] arr ) {
		int highNumber = arr[0];
		for(int i = 1; i <= arr.length-1; i++ ) 
			highNumber = highNumber > arr[i] ? highNumber : arr[i];
				
		return highNumber;
	}
	// O(N)
	public static int findHighNumber_N_2( int[] arr ) {
		QuickSelect quickSelect = new QuickSelect(arr);
		return quickSelect.quickSelect(arr.length, 0, arr.length-1);				
	}	
}
