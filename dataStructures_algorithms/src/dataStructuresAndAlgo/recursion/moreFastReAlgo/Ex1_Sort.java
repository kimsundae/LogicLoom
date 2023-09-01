package dataStructuresAndAlgo.recursion.moreFastReAlgo;

public class Ex1_Sort {

	public static void main(String[] args) {
		SortableArray sortableArray = new SortableArray( new int[] { 0, 5, 2, 1, 6, 3} );
		int arrSize = sortableArray.getSize();
		sortableArray.partition(0, arrSize-1);
		
		int[] result = sortableArray.getArray(); 
		
		for(int i = 0; i < result.length; i++) 
			System.out.println(result[i]);
		
	
	}
}
