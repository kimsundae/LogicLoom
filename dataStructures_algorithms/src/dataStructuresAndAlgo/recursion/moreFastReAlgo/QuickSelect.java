package dataStructuresAndAlgo.recursion.moreFastReAlgo;

public class QuickSelect extends QuickSort{
	
	public QuickSelect( int[] array ) {
		super( array );
	}
	
	public int quickSelect( int lowestValue , int leftIndex , int rightIndex ){
		// 하위 배열에 셀이 하나면 찾고 있던 값을 찾은 것이다.
		if( rightIndex - leftIndex <= 0 ) 
			return getArray()[leftIndex];
		
		// 배열을 분할하고 피벗을 가져온다.
		int pivotIndex = partition(leftIndex, rightIndex);
		
		
		// 찾고 있는 값이 피벗 왼쪽에 있다면
		if( pivotIndex > lowestValue )
			// 피벗 왼쪽의 하위 배열에 대해
			// 재귀적으로 퀵 셀렉트를 수행한다.
			return quickSelect( lowestValue , leftIndex , pivotIndex - 1 );
		// 찾고있는 값이 피벗 오른쪽에 있으면
		else if( pivotIndex < lowestValue )
			// 피벗 오른쪽의 하위 배열에 대해
			// 재귀적으로 퀵 셀렉트를 수행한다.
			return quickSelect( lowestValue , pivotIndex + 1 , rightIndex);
		else {
			// 분할 후 피벗의 인덱스가 k번 째 작은 값의 인덱스와 같다면
			// 찾고 있던 값을 찾은 것이다.
			return getArray()[pivotIndex];
		}							
	}
}

