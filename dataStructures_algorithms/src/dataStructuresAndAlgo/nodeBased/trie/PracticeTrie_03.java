package dataStructuresAndAlgo.nodeBased.trie;

import java.util.Map;

/*
* 401p 3. 트라이의 각 노드를 순회하며
*         "*"를 포함해 각 키를 출력하는 함수 작성
* */
public class PracticeTrie_03 extends Trie{
    public static void main(String[] args) {
        PracticeTrie_03 node = new PracticeTrie_03();
        node.insert("get"); node.insert("go");
        node.insert("got"); node.insert("gotten");
        node.printKey(null);
        /*
            result =    g
                        e
                        t
                        *
                        o
                        t
                        t
                        e
                        n
                        *
                        *
                        *
         */
    }
    public void printKey( TrieNode node ){
        // 입력 노드가 null이면 root 노드 대입
        TrieNode currentNode = node == null ? this.getRoot() : node;
        // 모든 key value 순회
        for(Map.Entry<Character, TrieNode> entry : currentNode.getChildren().entrySet()){
            // key 출력
            System.out.println( entry.getKey() );
            // key가 '*'라면 단어의 끝을 의미하므로
            // '*'이 아닐 경우에만 재귀 호출
            if(!(entry.getKey() == '*'))
                printKey( entry.getValue() );
        }
    }
}
