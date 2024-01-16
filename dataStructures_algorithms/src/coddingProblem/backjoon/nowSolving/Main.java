package coddingProblem.backjoon.nowSolving;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    static int N;
    static int count = 0;
    static StringBuilder sb = new StringBuilder();

    public static void hanoi( Stack A, Stack B, Stack C, int count, StringBuilder sb ){

        if( C.isFull() ) {

            if( Main.count > count  ) {
                Main.count = count;
                Main.sb = sb;
            }
            return;
        }

        if( !A.isEmpty() ){

            Stack tempA = new Stack(A);
            int temp =  tempA.pop();

            if( B.isEmpty() || B.pick() > temp )
                hanoi( tempA, new Stack(B, temp), C, count++, new StringBuilder(sb.append("1 2").append("\n")) );

            if( C.isEmpty() || C.pick() > temp)
                hanoi( tempA, B, new Stack(C, temp), count++, new StringBuilder(sb.append("1 3").append("\n")));

        }
        if( !B.isEmpty() ){

            Stack tempB = new Stack(B);
            int temp =  tempB.pop();

            if( A.isEmpty() || A.pick() > temp )
                hanoi( new Stack(A, temp), tempB, C, count++, new StringBuilder(sb.append("2 1").append("\n")) );

            if( C.isEmpty() || C.pick() > temp)
                hanoi( A, tempB, new Stack(C, temp), count++, new StringBuilder(sb.append("2 3").append("\n")));

        }
        if( !C.isEmpty() ){

            Stack tempC = new Stack(C);
            int temp =  tempC.pop();

            if( A.isEmpty() || A.pick() > temp )
                hanoi( A, new Stack(B, temp), tempC, count++, new StringBuilder(sb.append("3 2").append("\n")) );

            if( C.isEmpty() || C.pick() > temp)
                hanoi( new Stack(A, temp), B, tempC, count++, new StringBuilder(sb.append("3 1").append("\n")));

        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        N = n;

        Stack stack = new Stack(N);
        while(n-->0){
            stack.add(n+1);
        }

        hanoi( stack, new Stack(N), new Stack(N), 0, new StringBuilder() );
        System.out.println(sb);
/*        for(int i = 0; i < stack.stack.length; i++){
            System.out.println(stack.stack[i]);
        }*/

    }

    static class Stack{

        int[] stack;
        int index;

        Stack(int capacity){
            this.stack = new int[capacity];
            this.index = -1;
        }
        Stack(Stack stack){
            this.stack = stack.stack;
            this.index = stack.index;
        }
        Stack(Stack stack, int num){
            this.stack = stack.stack;
            this.index = stack.index;
            this.stack[++index] = num;
        }
        public void add(int num){
            stack[++index] = num;
        }
        public int pop(){
            return stack[index--];
        }
        public int pick(){
            return stack[index];
        }
        public boolean isFull(){
            return index == stack.length-1;
        }
        public boolean isEmpty(){
            return index == -1;
        }
    }

}