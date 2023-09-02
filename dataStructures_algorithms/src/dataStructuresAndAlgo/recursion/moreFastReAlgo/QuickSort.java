package dataStructuresAndAlgo.recursion.moreFastReAlgo;

public class QuickSort extends SortableArray{
	
	public QuickSort( int[] array ) {
		super( array );
	}
	
	public void quickSort( int leftIndex , int rightIndex ) {
		// 기저 조건: 하위 배열에 원소가 0개 또는 1개일 때
		if( rightIndex - leftIndex <= 0 ) 
			return;
		
		// 범위 내 원소들을 분할하고 피벗의 인덱스를 가져온다.
		int pivotIndex = partition( leftIndex , rightIndex );
		
		// 피벗 왼쪽에 대해 quicksort 메소드를 재귀적으로 호출한다.
		quickSort( leftIndex , pivotIndex );
		
		// 피벗 오른쪽에 대해 quicksort 메소드를 재귀적으로 호출한다.
		quickSort(pivotIndex + 1 , rightIndex);
		
	}
	

	
}
