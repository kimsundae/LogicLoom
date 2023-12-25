package coddingProblem.backjoon.categoryProblem.stack_queue_deque;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
*  https://www.acmicpc.net/problem/11866 요세푸스 문제0
* */
public class Queue_11866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        CustomLinkedList listA = new CustomLinkedList();
        CustomLinkedList listB = new CustomLinkedList();

        for( int i = 1; i <= N; i++ )
            listA.add(i);

        sb.append("<");
        int count = 1;
        boolean currentList = true;
        while( true ){

            if( currentList ){

                if( count % K != 0 ){
                    listB.add(listA.pop().value);
                }else{
                    sb.append(listA.pop().value).append(", ");
                }
                if( listA.size == 0 )
                    currentList = !currentList;

            }else {

                if( count % K != 0 ){
                    listA.add(listB.pop().value);
                }else{
                    sb.append(listB.pop().value).append(", ");
                }

                if( listB.size == 0 )
                    currentList = !currentList;

            }

            if( listA.size == 0 && listB.size == 0 )
                break;

            count++;
        }
        sb.delete(sb.length()-2,sb.length());
        sb.append(">");
        System.out.println(sb);
    }
    static class CustomLinkedList{
        Node firstNode;
        Node lastNode;
        int size;
        public CustomLinkedList(){
            firstNode = null;
            lastNode = null;
            size = 0;
        }
        public void add( int num ){
            if( firstNode == null ){
                Node node = new Node( num );
                firstNode = node;
                lastNode = node;
            }else {
                Node node = new Node( num );
                lastNode.nextNode = node;
                lastNode = node;
            }
            size++;
        }
        public Node pop(){
            if( firstNode == null )
                return null;
            Node node = firstNode;
            firstNode = firstNode.nextNode;
            size--;
            return node;
        }
    }
    static class Node{
        int value;
        Node nextNode;
        Node( int value ){
            this.value = value;
            nextNode = null;
        }
    }
}
