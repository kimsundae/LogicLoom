package coddingProblem.backjoon.categoryProblem.stack_queue_deque;


import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
*  https://www.acmicpc.net/problem/4949 균형잡힌 세상
* */
public class Stack_4949 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while( true ){

            String input = br.readLine();

            char[] stack = new char[input.length()];
            int nowIndex = -1;
            boolean isEquals = true;

            if( input.equals("."))
                break;

            for( int i = 0; i < input.length(); i++ ){

                char c = input.charAt(i);

                if( c == '(' || c == '[' )
                    stack[++nowIndex] = c;

                else if ( c == ')' || c == ']'){

                    c = c == ')' ? '(' : '[';

                    if( nowIndex == -1 ){
                        isEquals = false;
                        break;
                    }
                    else if( stack[nowIndex--] != c ){
                        isEquals = false;
                        break;
                    }
                }
            } // for

            if( isEquals && nowIndex == -1 )
                sb.append("yes").append("\n");
            else
                sb.append("no").append("\n");

        }
        System.out.println(sb);
    }
}