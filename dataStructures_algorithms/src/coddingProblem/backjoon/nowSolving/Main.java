package coddingProblem.backjoon.nowSolving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class Main {
    static int N;
    static int count = 0;
    static Set<String> set = new HashSet<>();
    static int[] row;
    static int[] col;


    public static boolean diagonal( int row, int high ){

        if( set.contains("diagonal " + row + " " + high ))
            return false;
        else{
            for (int i = 0; i < N-1; i++) {
                set.add("diagonal " + (row - 1) + " " + (high - 1));
                set.add("diagonal " + (row + 1) + " " + (high - 1));
                set.add("diagonal " + (row - 1) + " " + (high + 1));
                set.add("diagonal " + (row + 1) + " " + (high + 1));
              }
            return true;
        }
    }
/*    public static boolean match( int row, int high ){

    }*/
    public static void solve( int row, int col, int k ){

        for( int i = 0; i < N; i++){



        }

    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt( br.readLine() );
        row = new int[N];
        col = new int[N];
        solve( 0, 0, 0 );
        System.out.println(count);
    }
}