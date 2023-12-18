package coddingProblem.backjoon.nowSolving;


import java.io.*;

public class Main {



    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] stack = new int[k];
        int count = -1;
        int sum = 0;
        while( k-- > 0 ){

            int num = Integer.parseInt(br.readLine());

            if( num != 0 ){
                stack[++count] = num;
                sum += num;
            }
            else{
                sum -= stack[count--];
            }

        }
        System.out.println(sum);
    }
}