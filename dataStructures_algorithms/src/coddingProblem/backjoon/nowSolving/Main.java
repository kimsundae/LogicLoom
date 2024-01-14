package coddingProblem.backjoon.nowSolving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[] kantoa;
    // 초기 0, kantoa.length - 1
    static void kantoa(int left, int right){
        System.out.println("left = " + left);
        System.out.println("right = " + right);
        for(int i = 0; i<kantoa.length; i++)
            System.out.print(kantoa[i]);
        System.out.println();
        if(left < right) {

            int part = (right + 1 - left) / 3;
            int temp = part+left;
            int index = left + part;

            while (part-- > 0) {
                kantoa[index++] = ' ';
            }

            kantoa(left, temp - 1);
            kantoa(index, right);

        }

        // 0, 8
        // size == right + 1
        // size / 3 == 3
        // left + 3 == 3
        // 3, 4, 5
        // 6, 7, 8
        // replace 3, 4, 5

        // 0, 2
        // size == right + 1
        // size / 3 == 1
        // 1, 1

    }

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = "";
        while( (input = br.readLine()) != null && !input.isEmpty() ){

            int length = (int)Math.pow(3,Double.parseDouble(input));

            kantoa = new char[length];

            for (int i = 0; i < length; i++)
                kantoa[i] = '-';

            kantoa( 0, kantoa.length-1 );
            for(int i = 0; i<kantoa.length; i++)
                sb.append(kantoa[i]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}