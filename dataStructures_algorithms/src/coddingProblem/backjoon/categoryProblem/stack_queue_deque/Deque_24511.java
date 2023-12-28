package coddingProblem.backjoon.categoryProblem.stack_queue_deque;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* https://www.acmicpc.net/problem/24511 queuestack
* */
public class Deque_24511 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer queueOrStacks = new StringTokenizer(br.readLine(), " ");
        StringTokenizer values = new StringTokenizer(br.readLine(), " ");

        Custom dequeue = new Custom();
        while( N-- > 0 ){

            int queueOrStack = Integer.parseInt(queueOrStacks.nextToken());
            int value = Integer.parseInt(values.nextToken());

            if(queueOrStack == 0)
                dequeue.addBack(value);

        }
        int M = Integer.parseInt(br.readLine());
        StringTokenizer cValues = new StringTokenizer(br.readLine(), " ");
        while( M-- > 0 ){
            int value = Integer.parseInt(cValues.nextToken());
            dequeue.add(value);
            sb.append(dequeue.pop()).append(" ");
        }
        System.out.println(sb);
    }
    static class Custom{
        Node firstNode;
        Node lastNode;
        Custom(){
            firstNode = null;
            lastNode = null;
        }
        public void add(int value){
            Node node = new Node(value);
            if( firstNode == null ){
                firstNode = node;
                lastNode = node;
            }else{
                node.nextNode = firstNode;
                firstNode.previousNode = node;
                firstNode = node;
            }
        }
        public void addBack(int value){
            Node node = new Node(value);
            if( firstNode == null ){
                firstNode = node;
                lastNode = node;
            }else{
                node.previousNode = lastNode;
                lastNode.nextNode = node;
                lastNode = node;
            }
        }
        public int pop(){
            Node node = lastNode;
            if( lastNode.previousNode != null ){
                lastNode = lastNode.previousNode;
            }else{
                lastNode = null;
                firstNode = null;
            }
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
