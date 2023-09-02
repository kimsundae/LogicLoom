package dataStructuresAndAlgo.recursion.moreFastReAlgo;

public class Ex1_Sort {

	public static void main(String[] args) {
		
		int[] array = new int[] { 0, 5, 2, 1, 6, 3};
		
		SortableArray sortableArray = new SortableArray( array );
		int arrSize = sortableArray.getSize();
		sortableArray.partition(0, arrSize-1);
		
		array = sortableArray.getArray();
		
		for(int i = 0; i < array.length; i++) 
			System.out.println(array[i]);
			
	}
}
