package coddingProblem.backjoon.categoryProblem.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
* https://www.acmicpc.net/problem/4779 칸토어 집합
* */
public class Recursion_4779 {
    static char[] kantoa;

    static void kantoa(int left, int right){

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