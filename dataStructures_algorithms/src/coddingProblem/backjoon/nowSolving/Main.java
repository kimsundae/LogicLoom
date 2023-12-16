package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{

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

        int T = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        int prime = 2;

        while ( 1000000 >= prime ){

            if(isPrime(prime)) {
                list.add(prime);
            }
            prime++;
        }
        for( int z = 0; z < T; z++ ) {
            int N = Integer.parseInt(br.readLine());
            boolean isGold = true;
            int count = 0;
            for (int i = 0; list.get(i) < N; i++) {

                for (int j = 0; list.get(j) < N; j++) {
                    int iValue = list.get(i);
                    int jValue = list.get(j);
                    if( iValue + jValue == N ){
                        count++; break;
                    }else if( iValue + jValue > N){
                        break;
                    }

                }

            }
            sb.append(count % 2 == 0 ? count / 2 : count / 2 +1).append("\n");
        }
        System.out.println(sb);
    }
}
