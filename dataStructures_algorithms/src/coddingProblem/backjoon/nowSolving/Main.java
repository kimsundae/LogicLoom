package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.*;


public class Main{

    public static boolean isPrime(int N){
        if( 2 > N ) return false;
        for( int i = 2; i*i <= N; i++ ){
            if( N % i == 0) return false;
        }
        return true;
    }
    /*public static void main(String[] args) throws IOException {
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
    }*/
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        Set<Integer> primeSet = new HashSet<>();

        int count = 2;
        while( 1000000 >= count ){
            if( isPrime(count) ){
                primeSet.add(count);
            }
            count++;
        }
        int[] primes = new int[primeSet.size()];
        Iterator<Integer> iterator = primeSet.iterator();
        count = 0;
        while(iterator.hasNext()){
            primes[count] = iterator.next();
            count++;
        }

        for( int i = 0; i < T; i++ ){
            int N = Integer.parseInt(br.readLine());
            int startPrime = N;
            int goldCount = 0;
            int startIndex = N;
            while( true ){
                startIndex--;
                int index = binarySearch( startIndex, primes );
                if(index != -1){
                    startIndex = index;
                    break;
                }

            }
            while( true ){
                startPrime = calStartPrime( startPrime, primeSet );
                if(  N/2 > startIndex )
                    break;
                if( primeSet.contains(N - startPrime)){
                    goldCount++;
                }

            }
            sb.append(goldCount).append("\n");
        }
        System.out.println(sb);
    }
    public static int calStartPrime( int startPrime, Set<Integer> primeSet ){
        while(true){
            startPrime--;
            if(primeSet.contains(startPrime)){
                return startPrime;
            }
        }
    }
    public static int binarySearch( int searchNum, int[] primes ) {

        int lower = 0;
        int upper = primes.length - 1;
        while (upper >= lower) {

            int mid = (upper + lower) / 2;
            int midValue = primes[mid];

            if( searchNum == midValue )
                return mid;

            else if ( searchNum > midValue )
                lower = mid + 1;

            else if( midValue > searchNum )
                upper = mid - 1;

        }
        return -1;
    }
}
