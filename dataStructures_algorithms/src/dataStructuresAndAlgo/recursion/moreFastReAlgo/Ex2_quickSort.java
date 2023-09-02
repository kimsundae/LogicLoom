package dataStructuresAndAlgo.recursion.moreFastReAlgo;

public class Ex2_quickSort {
	public static void main(String[] args) {
		int[] array = new int[] {0, 5, 2, 1, 6, 3};
		QuickSort quickSort = new QuickSort(array);
		quickSort.quickSort(0, array.length - 1 );
		array = quickSort.getArray();
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
}
