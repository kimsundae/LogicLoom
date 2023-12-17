package coddingProblem.backjoon.nowSolving;


import java.io.*;

public class Main {
    public static int soleved( int num ){
        boolean isPrime = true;
        int value = num;
        int count = 0;
        if( 2 > num ) return 0;
        for( int i = 2; i <= num; i++ ){

            if( value % i == 0 ){
                if( value / i == 1 ) {
                    System.out.println("num="+num);count++;
                    System.out.println("count="+count);break;}
                value /= i;
                i = 2;
                count += 2;
                isPrime = false;
            }
        }
        if( isPrime )
            return -1;

        return count % 2 == 0 ? 0 : -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = N;

        for (int i = 2; i <= N; i++) {

            count += soleved( i );

        }
        System.out.println(count);
    }
}
    /*public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = N;

        for( int i = 2; i <= N; i++ ){
            boolean isOpen = true;
            boolean isPrime = true;
            for( int j = 2; j <= i; j++ ){
                if( i % j == 0 ){
                    isOpen = !isOpen;
                    isPrime = false;
                }
                else if( j*j >= i && isPrime) {
                    isOpen = false;
                    break;
                }

            }
            if( !isOpen )
                count--;
            }
        System.out.println(count);
        }
    }*/
    /*public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = N;

        for( int i = 2; i <= N; i++ ){
            boolean isOpen = true;
            boolean isPrime = true;
            for( int j = 2; j <= i; j++){


                if( i % j == 0 ){
                    isOpen = !isOpen;
                    isPrime = false;
                }
                else if( j*j >= i && isPrime) {
                    isOpen = false;
                    break;
                }

            }
            if( !isOpen )
                count--;

        }
        System.out.println(count);
    }*/
