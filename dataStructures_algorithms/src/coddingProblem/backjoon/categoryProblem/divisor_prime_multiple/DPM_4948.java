package coddingProblem.backjoon.categoryProblem.divisor_prime_multiple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* https://www.acmicpc.net/problem/4948 베르트랑 공준
* */
public class DPM_4948 {
/*    public static boolean isPrime(int N){
        if( 2 > N ) return false;
        for( int i = 2; i*i <= N; i++ ){
            if( N % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            int N = Integer.parseInt(br.readLine());
            if( N == 0) { break; }

            int doubleN = N*2;
            int count = 0;
            N++;
            while( doubleN >= N ){
                if(isPrime(N)){
                    count++;
                }
                N++;
            }
            sb.append(count).append("\n");
        }


        System.out.println(sb);
    }*/
    public static boolean isPrime(int N){
        if( 2 > N ) return false;
        for( int i = 2; i*i <= N; i++ ){
            if( N % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = 2;
        boolean[] numbers = new boolean[123457*2];
        while( 123457*2 >= count ){

            if( isPrime(count) ){
                numbers[count] = true;
            }
            count++;

        }

        while( true ){

            int N = Integer.parseInt(br.readLine());
            if( N == 0 )
                break;
            int doubleN = N*2;
            int primes = 0;
            for( int i = N+1; i <= doubleN; i++ ){

                if( numbers[i] )
                    primes++;

            }
            sb.append(primes).append("\n");



        }
        System.out.println(sb);
    }
}
