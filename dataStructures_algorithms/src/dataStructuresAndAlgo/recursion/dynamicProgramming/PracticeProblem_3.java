package dataStructuresAndAlgo.recursion.dynamicProgramming;

import java.util.HashMap;

/*
 * 257p.
 * 		유일 경로 해법 메소드. 메모이제이션으로 효율성 개선문제
 * 	def unique_paths(rows, columns)
 * 		return 1 if rows == 1 || columns == 1
 * 		return unique_paths(rows - 1, columns) + unique)paths(rows, columns - 1)
 * 	end
 */

public class PracticeProblem_3 {
	static int n = 0;
	public static int unique_paths_before( int rows , int columns , HashMap<int[] , Integer> Map ) {
		System.out.println(++n);
		if( rows == 1 || columns == 1 ) return 1;
		int[] arr = new int[] {rows , columns};
		if( Map.containsKey(arr)) return Map.get(arr);
		return unique_paths_before( rows - 1 , columns , Map ) + unique_paths_before( rows , columns - 1 , Map);
	}
	public static int unique_paths_after( int rows , int columns , HashMap< String , Integer> Map ) {
		System.out.println(++n);
		if( rows == 1 || columns == 1 ) return 1;
		// 열과 행에대한 키가 있어야함
		String key = rows + "," + columns;
		if( Map.containsKey(key) ) return Map.get(key);
		else Map.put(key , unique_paths_after( rows - 1 , columns , Map ) + unique_paths_after( rows , columns - 1 , Map));
		return Map.get(key);
	}
	public static void main(String[] args) {
		int result = unique_paths_before( 3 ,  5 , new HashMap<>() );
		System.out.println("result : " + result); n = 0;
		int result2 = unique_paths_after( 3 ,  5 , new HashMap<>() );		
		System.out.println("result2 : " + result2);
		// result : 15
		// 메모이제이션 적용 전 n : 29
		// 적용 후 n : 17
	}

}
