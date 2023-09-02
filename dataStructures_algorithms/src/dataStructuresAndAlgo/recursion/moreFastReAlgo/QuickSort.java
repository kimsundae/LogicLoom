package dataStructuresAndAlgo.recursion.moreFastReAlgo;

public class QuickSort {
	
private int[] array; 
	
	public QuickSort( int[] array) {
		this.array = array;
	}
	public int[] getArray() {
		return array;
	}
	public int getSize() {
		return array.length;
	}
	
	public void quickSort( int leftIndex , int rightIndex ) {
		
	}
	
	public int partition(int leftPointer , int rightPointer) {
		
		// 항상 가장 오른쪽에 있는 값을 피벗으로 선택한다.
		// 나중에 사용할 수 있게 피벗의 인덱스를 저장한다.
		int pivotIndex = rightPointer;
		
		// 피벗 값을 저장해둔다.
		int pivot = array[pivotIndex];
		
		// 피벗 바로 왼쪽에서 오른쪽 포인터를 시작시킨다.
		rightPointer--;
		
		while(true) {
			
			// 피벗보다 크거나 같은 값을 가리킬 때까지
			// 왼쪽 포인터를 오른쪽으로 옮긴다.
			while( array[leftPointer] < pivot ) {
				leftPointer++;
			}
			
			// 피벗보다 작거나 같은 값을 가리킬 때까지
			// 오른쪽 포인터를 왼쪽으로 옮긴다.
			while ( array[rightPointer] > pivot ) {
				rightPointer--;
			}
			// 이제 왼쪽 포인터와 오른쪽 포인터 모두 이동을 멈췄다.
			// 왼쪽 포인터가 오른쪽 포인터에 도달했거나 넘어섰는지 확인한다.
			// 그렇다면 루프를 빠져 나가 이후 코드에서 피벗을 교환한다.
			if( leftPointer >= rightPointer ) {
				break;
			}	
			else {
				int temp = array[leftPointer];
				array[leftPointer] = array[rightPointer];
				array[rightPointer] = temp;
				
				leftPointer++;
			}
			
		}// w
		// 분할의 마지막 단곓 왼쪽 포인터의 값과 피벗을 교환한다.
		int temp = array[leftPointer];
		array[leftPointer] = array[pivotIndex];
		array[pivotIndex] = temp;
		
		return leftPointer;
	}
	
}
