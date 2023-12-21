package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] stack = new int[N];
        int nowIndex = -1;
        int nowNum = 1;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while( N-- > 0){


            int num = Integer.parseInt(st.nextToken());

            if( num == nowNum ){
                nowNum++;
            }else if ( nowIndex != -1 ){

                if( stack[nowIndex] == nowNum ){
                    while (nowIndex != -1){
                        if(stack[nowIndex] == nowNum){
                            nowIndex--; nowNum++;
                        }else
                            break;
                    }
                    stack[++nowIndex] = num;
                }else
                    stack[++nowIndex] = num;

            }else{
                stack[++nowIndex] = num;
            }

        }

        boolean canEat = true;
        while( nowIndex != -1 ){
            if( stack[nowIndex--] != nowNum++ ) {
                canEat = false;
                break;
            }
        }

        System.out.println( canEat ? "Nice" : "Sad" );

    }
}