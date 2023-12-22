package coddingProblem.backjoon.categoryProblem.stack_queue_deque;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
*  https://www.acmicpc.net/problem/18258 큐 2
* */
public class Queue_18258 {
    static int[] queue;
    static int frontIndex = 0;
    static int backIndex = -1;
    public static void push( int num ){
        queue[++backIndex] = num;
    }
    public static int pop(){
        if( backIndex == -1 || frontIndex > backIndex )
            return -1;
        else
            return queue[frontIndex++];
    }
    public static int size(){
        if( backIndex == -1 || frontIndex > backIndex )
            return 0;
        else
            return backIndex+1 - frontIndex;
    }
    public static int empty(){
        if( backIndex == -1 || frontIndex > backIndex )
            return 1;
        else
            return 0;
    }
    public static int front(){
        if( backIndex == -1 || frontIndex > backIndex )
            return -1;
        else
            return queue[frontIndex];
    }
    public static int back(){
        if( backIndex == -1 || frontIndex > backIndex )
            return -1;
        else
            return queue[backIndex];
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        queue = new int[N];

        while( N-- > 0 ){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            switch ( order ){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}