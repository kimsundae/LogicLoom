package coddingProblem.backjoon.nowSolving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr = new int[9][9];

    public static void find( int row, int col ){

        int sum = 0;
        boolean flag = true;

        for( int tCol = 0; tCol < 9; tCol++ ){
            if( col != tCol && arr[row][tCol] == 0 ){
                flag = false;
                break;
            }
            sum += arr[row][tCol];
        }

        if(flag) {
            arr[row][col] = 45 - sum;
            return;
        }

        sum = 0;
        flag = true;

        for( int tRow = 0; tRow < 9; tRow++ ){
            if( row != tRow && arr[tRow][col] == 0 ){
                flag = false;
                break;
            }
            sum += arr[tRow][col];
        }

        if(flag) {
            arr[row][col] = 45 - sum;
            return;
        }

        sum = 0;
        flag = true;
        int startRow = row/3*3, startCol = col/3*3;
        for( int tRow = startRow; tRow <= startRow+2; tRow++ ){
            for( int tCol = startCol; tCol <= startCol+2; tCol++ ){
                if( row != tRow && col != tCol && arr[tRow][col] == 0 ){
                    flag = false;
                    break;
                }
                sum += arr[tRow][tCol];
            }
        }
        if(flag) {
            arr[row][col] = 45 - sum;
            return;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 9; row++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int col = 0; col < 9; col++)
                arr[row][col] = Integer.parseInt(st.nextToken());

        }


        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (arr[row][col] == 0)
                    find(row, col);
                sb.append(arr[row][col]);
                if (col != 8)
                    sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

}