package coddingProblem.backjoon.nowSolving;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 5;
        for( int i = 0; i < n; i++ ){

            for( int j = 0; j < i; j++ ){
                System.out.print(" ");
            }
            for( int k = 0; k < 2 * (n - i) - 1; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i = 1; i < n; i++ ){
            for (int j = n-i-1; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i +1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}