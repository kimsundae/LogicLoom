package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        // 첫째 줄에 queuestack을 구성하는 자료구조의 개수 N이 주어진다.
        int N = Integer.parseInt(br.readLine());
        //둘째 줄에 길이 N의 수열
        //A가 주어진다. 0이면 큐 1이면 스택
        st = new StringTokenizer(br.readLine(), " ");
        DataStructure[] ds = new DataStructure[st.countTokens()];
        for( int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num == 0)
                ds[i] = new Queue();
            else
                ds[i] = new Stack();
        }

        st = new StringTokenizer(br.readLine(), " ");
        for( int i = 0; i < N; i++ )
            ds[i].add(Integer.parseInt(st.nextToken()));

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for( int i = 0; i < N; i++ ){
            int value = Integer.parseInt(st.nextToken());
            ds[0].add(value);
            int xn = ds[0].pop();
            for( int j = 1; j < M; j++ ){
                ds[j].add(xn);
                xn = ds[j].pop();
            }
            sb.append(xn).append(" ");
        }
        System.out.println(sb);
    }
    static interface DataStructure{
        void add( int value );
        int pop();
    }
    static class Stack implements DataStructure{
        Node lastNode;
        Stack(){
            lastNode = null;
        }
        public void add( int value ){
            Node node = new Node(value);
            if(lastNode == null)
                lastNode = node;
            else{
                lastNode.nextNode = node;
                node.previousNode = lastNode;
                lastNode = node;
            }
        }
        public int pop(){
            Node node = lastNode;
            if( lastNode.previousNode != null )
                lastNode = lastNode.previousNode;
            else
                lastNode = null;
            return node.value;
        }
    }
    static class Queue implements DataStructure{
        Node firstNode;
        Queue(){
            firstNode = null;
        }
        public void add( int value ){
            Node node = new Node(value);
            if( firstNode == null ) {
                firstNode = node;
            }
            else {
                node.nextNode = firstNode;
                firstNode = node;
            }
        }
        public int pop(){
            Node node = firstNode;
            if(firstNode.nextNode != null) {
                firstNode = firstNode.nextNode;
            }
            else
                firstNode = null;
            return node.value;
        }
    }
    static class Node{
        int value;
        Node nextNode;
        Node previousNode;
        Node(int value){
            this.value = value;
            nextNode = null;
            previousNode = null;
        }
    }
}
