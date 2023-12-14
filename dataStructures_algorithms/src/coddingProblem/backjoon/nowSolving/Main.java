package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static boolean isPrime(int N){
        if( 2 > N ) return false;
        for( int i = 2; i*i < N; i++ ){
            if( N % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int doubleN = N*2;
        while( doubleN >= N ){
            if(isPrime(N)){
                sb.append(N).append("\n");
            }
            N++;
        }
        //
    }
}
