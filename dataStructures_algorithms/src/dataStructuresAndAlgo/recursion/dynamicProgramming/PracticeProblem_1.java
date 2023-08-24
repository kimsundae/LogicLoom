package dataStructuresAndAlgo.recursion.dynamicProgramming;

/* 
 * 256p. 1. 주어지는 함수의 불필요한 재귀 호출을 없애기 
 * 
 * 		def add_until_100(array)
 * 			return 0 if array.length == 0
 * 			if array[0] + add_until_100(array[1, array.length - 1]) > 100
 * 				return add_until_100(array[1, array.length - 1])
 * 			else
 * 				return array[0] + add_until_100(array[1, array.length - 1])
 * 			end
 * 		end
 */
public class PracticeProblem_1 {

	public static void main(String[] args) {
		
		
	}

}
