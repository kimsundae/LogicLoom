package coddingProblem.backjoon.categoryProblem.divisorAndPrimeAndMultiple;


import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
* https://www.acmicpc.net/problem/17103 골드바흐 파티션
* */
public class DPM_17103 {

    public static boolean isPrime(int N){
        if( 2 > N ) return false;
        for( int i = 2; i*i <= N; i++ ){
            if( N % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        boolean[] primes = new boolean[1000001];

        int count = 2;
        while( 1000000 >= count ){
            if( isPrime(count) ){
                primes[count] = true;
            }
            count++;
        }

        for( int i = 0; i < T; i++ ){
            int N = Integer.parseInt(br.readLine());
            int startPrime = N-1;
            int goldCount = 0;

            for( int j = startPrime; j >= N/2; j-- ){
                // 소수일 경우
                if( primes[j] ) {
                    // N - j 또한 소수라면
                    // 골드바흐 파티션 ++
                    if (primes[N - j]) {
                        goldCount++;
                    }

                }
            }
            sb.append(goldCount).append("\n");
        }
        System.out.println(sb);
    }
}
