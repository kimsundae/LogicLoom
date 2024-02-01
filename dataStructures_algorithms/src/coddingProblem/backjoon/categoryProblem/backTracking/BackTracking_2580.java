package coddingProblem.backjoon.categoryProblem.backTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/*
* https://www.acmicpc.net/problem/2580 스도쿠
* */
public class BackTracking_2580 {

    static int[][] arr = new int[9][9];
    static List<String> zeroArr = new ArrayList<>();
    static boolean isOver = false;

    public static List<Integer> find( int row, int col ){

        int[] tempArr = new int[10];

        for( int tCol = 0; tCol < 9; tCol++ ) {
            tempArr[arr[row][tCol]]++;
        }


        for( int tRow = 0; tRow < 9; tRow++ )
            tempArr[arr[tRow][col]]++;


        int startRow = row/3*3, startCol = col/3*3;
        for( int tRow = startRow; tRow <= startRow+2; tRow++ ){
            for( int tCol = startCol; tCol <= startCol+2; tCol++ ){
                tempArr[arr[tRow][tCol]]++;
            }
        }

        List<Integer> zero = new ArrayList<>();
        boolean flag = false;
        for( int i = 1; i <= 9; i++ ){
            if(tempArr[i] == 0) {
                zero.add(i);
                flag = true;
            }
        }

        return !flag ? null : zero;
    }
    public static void solve( int index ){

        if( isOver )
            return;

        if( index >= zeroArr.size() ) {
            print();
            isOver = true;
            return;
        }

        int row = zeroArr.get(index).charAt(0)-48, col = zeroArr.get(index).charAt(2)-48;
        List<Integer> zero = find( row, col );

        if( zero == null ) {
            return;
        }

        for( int i = 0; i < zero.size(); i++ ){
            arr[row][col] = zero.get(i);
            solve( index+1 );
            arr[row][col] = 0;
        }

    }
    public static void print(){
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                sb.append(arr[row][col]);
                if(col != 8) sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 9; row++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int col = 0; col < 9; col++) {
                int num = Integer.parseInt(st.nextToken());
                arr[row][col] = num;
                if( num == 0 )
                    zeroArr.add( row + " " + col );
            }
        }
        solve( 0 );

    }
}