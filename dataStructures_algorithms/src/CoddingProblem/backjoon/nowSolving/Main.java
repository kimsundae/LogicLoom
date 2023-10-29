package CoddingProblem.backjoon.nowSolving;


import java.util.StringTokenizer;

public class Main {
	// 피보나치 수 구하는 메서드
	public static String returnFibonacci() {
		StringBuilder sb = new StringBuilder();
		long a = 0;
		long b = 1;

		while(  99987654321L > b  ) {
			// 가장 이전 값 tmp
			long tmp = a;
			// 그 다음 값 a
			a = b;
			// 두 값을 합쳐 b에 할당
			b = tmp + a;
			if (99987654321L > b && b > 12345678999L) sb.append(b).append(" ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer( returnFibonacci() , " "  );
		long sum = 0;
		while(st.hasMoreTokens()){
			sum += Long.parseLong(st.nextToken());
		}
		System.out.println(sum);
	}
}
