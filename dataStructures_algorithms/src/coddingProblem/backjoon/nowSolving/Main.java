package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        CustomLinkedList dequeue = new CustomLinkedList();

        for( int i = 1; i <= N; i++ )
            dequeue.add( i, Integer.parseInt(st.nextToken()));

        Node node = dequeue.firstNode;
        while( N-- > 0 ){

            Node tempNode;
            dequeue.delete(node);

            if( node.value > 0 )
                tempNode = dequeue.right( node.value, node );
            else
                tempNode = dequeue.left( node.value, node );
            sb.append(node.index).append(" ");
            node = tempNode;
        }
        System.out.println(sb.toString());
    }
    static class CustomLinkedList{
        Node firstNode;
        Node lastNode;
        CustomLinkedList(){
            firstNode = null;
            lastNode = null;
        }
        public void add( int index, int value ){
            Node node = new Node( index, value );
            if( firstNode == null ){
                firstNode = node;
                lastNode = node;
                firstNode.nextNode = lastNode;
                firstNode.previousNode = lastNode;
            }else{
                lastNode.nextNode = node;
                node.previousNode = lastNode;
                node.nextNode = firstNode;
                firstNode.previousNode = node;
                lastNode = node;
            }
        }
        public Node left( int moveIndex, Node node ){

            while( moveIndex++ != 0 ){
                node = node.previousNode;
            }
            return node;
        }
        public Node right( int moveIndex, Node node ){

            while( moveIndex-- != 0){
                node = node.nextNode;
            }
            return node;
        }
        public void delete( Node deleteNode ){
            if( deleteNode == firstNode ){
                firstNode = firstNode.nextNode;
                firstNode.previousNode = lastNode;
                lastNode.nextNode = firstNode;
            }else if( deleteNode == lastNode ){
                lastNode = lastNode.previousNode;
                lastNode.nextNode = firstNode;
                firstNode.previousNode = lastNode;
            }else{
                deleteNode.previousNode.nextNode = deleteNode.nextNode;
                deleteNode.nextNode.previousNode = deleteNode.previousNode;
            }
        }
    }
    static class Node{
        int index;
        int value;
        Node nextNode;
        Node previousNode;
        Node( int index, int value ){
            this.index = index;
            this.value = value;
            nextNode = null;
            previousNode = null;
        }
    }
}
