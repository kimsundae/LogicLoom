package coddingProblem.backjoon.categoryProblem.stach_queue_deque;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
*   https://www.acmicpc.net/problem/28278   스택2
* */
public class stack_28278 {

    static int[] stack = new int[1000000];
    static int nowIndex = -1;
    //1
    public static void push( int x ){
        stack[++nowIndex] = x;
    }
    //2
    public static int pop(){
        if( nowIndex == -1 )
            return -1;
        return stack[nowIndex--];
    }
    //3
    public static int size(){
        if( nowIndex == -1 )
            return 0;
        return nowIndex + 1;
    }
    //4
    public static int isEmpty(){
        if( nowIndex == -1 )
            return 1;
        else
            return 0;
    }
    //5
    public static int read(){
        if( nowIndex == -1 )
            return -1;
        else
            return stack[nowIndex];
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());

        for( int i = 0; i < N; i++ ){
            st = new StringTokenizer(br.readLine()," ");

            int older = Integer.parseInt(st.nextToken());
            switch (older){
                case 1:
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    sb.append(pop()).append("\n");
                    break;
                case 3:
                    sb.append(size()).append("\n");
                    break;
                case 4:
                    sb.append(isEmpty()).append("\n");
                    break;
                case 5:
                    sb.append(read()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}