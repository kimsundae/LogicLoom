package dataStructuresAndAlgo.recursion.dynamicProgramming;


/*
 * 255p. 상향식을 통한 피보나치
 * 
 */
public class bottomUpFibonacci {
	
	public static int fib( int n ) {
		if( n == 0) return 0;
		
		int a = 0;
		int b = 1;
		
		for( int i = 1; i < n; i++) {
			// 가장 이전 값 tmp
			int tmp = a;
			// 그 다음 값 a
			a = b;
			// 두 값을 합쳐 b에 할당
			b = tmp + a;
			
		}
		return b;
	}
	
	public static void main(String[] args) {
		int result = fib( 10 );
		System.out.println( result );
		// 결과값 55
	}

}
