package coddingProblem.backjoon.categoryProblem.stack_queue_deque;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/28279 덱 2
* */
public class Deque_28279 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        CustomLinkedList dequeue = new CustomLinkedList();

        while( N-- > 0 ){
            st = new StringTokenizer(br.readLine(), " ");
            int order = Integer.parseInt(st.nextToken());
            switch (order){
                case 1:
                    dequeue.addFront(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    dequeue.addBack(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    sb.append(dequeue.popFront()).append("\n");
                    break;
                case 4:
                    sb.append(dequeue.popBack()).append("\n");
                    break;
                case 5:
                    sb.append(dequeue.size()).append("\n");
                    break;
                case 6:
                    sb.append(dequeue.isEmpty()).append("\n");
                    break;
                case 7:
                    sb.append(dequeue.readFront()).append("\n");
                    break;
                case 8:
                    sb.append(dequeue.readBack()).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
    static class CustomLinkedList{
        Node firstNode;
        Node lastNode;
        int size;
        CustomLinkedList(){
            firstNode = null;
            lastNode = null;
            size = 0;
        }
        // 1.
        public void addFront( int X ){
            Node node = new Node(X);
            if( firstNode == null ){
                firstNode = node;
                lastNode = node;
            }else {
                node.nextNode = firstNode;
                firstNode.previousNode = node;
                firstNode = node;
            }
            size++;
        }
        // 2.
        public void addBack( int X ){
            Node node = new Node(X);
            if( firstNode == null ){
                firstNode = node;
                lastNode = node;
            }else {
                lastNode.nextNode = node;
                node.previousNode = lastNode;
                lastNode = node;
            }
            size++;
        }
        // 3.
        public int popFront(){
            if( size == 0 )
                return -1;
            else if( size == 1 ){
                Node node = firstNode;
                firstNode = null;
                lastNode = null;
                size--;
                return node.value;
            }
            else {
                Node node = firstNode;
                firstNode = firstNode.nextNode;
                size--;
                return node.value;
            }
        }
        // 4.
        public int popBack(){
            if( size == 0 )
                return -1;
            else if( size == 1 ){
                Node node = lastNode;
                firstNode = null;
                lastNode = null;
                size--;
                return node.value;
            }
            else {
                Node node = lastNode;
                lastNode = lastNode.previousNode;
                size--;
                return node.value;
            }
        }
        // 5.
        public int size(){
            return size;
        }
        // 6.
        public int isEmpty(){
            if( size == 0 )
                return 1;
            else
                return 0;
        }
        // 7.
        public int readFront(){
            if( size == 0 )
                return -1;
            else
                return firstNode.value;
        }
        // 8.
        public int readBack(){
            if( size == 0 )
                return -1;
            else
                return lastNode.value;
        }
    }
    static class Node{
        int value;
        Node nextNode;
        Node previousNode;
        Node( int value ){
            this.value = value;
            this.nextNode = null;
            this.previousNode = null;
        }
    }
}