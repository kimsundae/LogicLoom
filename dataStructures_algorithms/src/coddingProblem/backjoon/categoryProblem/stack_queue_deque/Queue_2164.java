package coddingProblem.backjoon.categoryProblem.stack_queue_deque;


import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
*  https://www.acmicpc.net/problem/2164 카드2
* */
public class Queue_2164 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        customizeLinkedList customList = new customizeLinkedList();
        for( int i = 1; i <= N; i++ ){
            customList.addNode(i);
        }
        while( customList.firstNode != customList.LastNode ){
            customList.delete();
            customList.addNode(customList.pop().value);
        }
        System.out.println(customList.firstNode.value);
    }

    static class customizeLinkedList{
        Node firstNode;
        Node LastNode;
        public customizeLinkedList(){
            firstNode = null;
            LastNode = null;
        }
        public void read(){
            Node currentNode = firstNode;
            while(currentNode != null){
                System.out.println(currentNode.value);
                currentNode = currentNode.nextNode;
            }
        }
        public void addNode( int num ){
            if( firstNode == null ) {
                Node node = new Node(num, null);
                firstNode = node;
                LastNode = node;
            }else{
                Node node = new Node( num, null );
                LastNode.nextNode = node;
                LastNode = node;
            }
        }
        public Node pop(){
            Node node = firstNode;
            firstNode = node.nextNode;
            return node;
        }
        public void delete(){
            firstNode = firstNode.nextNode;
        }
    }
    static class Node{
        int value;
        Node nextNode;
        public Node( int num, Node node ){
            this.value = num;
            this.nextNode = node;
        }
    }
}
