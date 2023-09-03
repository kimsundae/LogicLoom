package dataStructuresAndAlgo.recursion.moreFastReAlgo;

public class Ex3_quickSelect {

	public static void main(String[] args) {
		int [] array = new int[] {0, 50, 20, 10, 60, 30};
		QuickSelect quickSelect = new QuickSelect(array);
		int result = quickSelect.quickSelect( 1, 0, array.length - 1);
		System.out.println("result : " + result);

	}
}
