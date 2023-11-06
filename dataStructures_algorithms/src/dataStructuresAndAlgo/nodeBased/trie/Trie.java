package dataStructuresAndAlgo.nodeBased.trie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
* 루트 노드
* */
public class Trie {
    private TrieNode root;
    public Trie(){
        root = new TrieNode();
    }
    public TrieNode getRoot(){return root;}
    // 검색 메서드
    public TrieNode search( String word ){
        TrieNode currentNode = this.root;
        for(char c : word.toCharArray()) {
            // 현재 노드에 현재 문자를 키로 하는 자식이 있으면
            if (currentNode.getChildren().containsKey(c)) {
                // 자식 노드를 따라간다.
                currentNode = currentNode.getChildren().get(c);
            }
            else
                // 현재 노드의 자식 중에 현재 문자가 없으면
                // 검색하려는 단어가 트라이에 없는 것이다.
                return null;
        }
        return currentNode;
    }
    // 삽입 메서드
    public void insert( String word ){
        TrieNode currentNode = this.root;

        for( char c : word.toCharArray() ){
            // 현재 노드에 현재 문자를 키로 하는 자식이 있으면
            if(currentNode.getChildren().containsKey(c)){
                // 자식 노드를 따라간다
                currentNode = currentNode.getChildren().get(c);
            }
            else {
                // 현재 노드의 자식 중에 현재 문자가 없으면
                // 그 문자를 새 자식 노드로 추가한다.
                currentNode.getChildren().put(c, new TrieNode());
                // 새로 추가한 노드를 따라간다.
                currentNode = currentNode.getChildren().get(c);
            }
        }
        // 단어 전체를 트라이에 삽입했으면
        // 마지막으로 *를 추가한다.
        currentNode.getChildren().put('*', null);
    }
    // 단어 수집 메서드
    public List<String> collectAllWords(TrieNode node, String word, ArrayList<String> words){
        /*
        *   메서드는 인수 세 개를 받는다.
        *   첫 번째 인수인 node는 그 자손들에게서 단어를 수집할 노드이다.
        *   두 번째 인수인 word는 빈 문자열로 시작하고
        *   트라이를 이동하면서 문자가 추가된다.
        *   세 번째 인수인 words는 빈 배열로 시작하고
        *   함수가 끝날 때는 트라이 내 모든 단어를 포함한다.
        *
        *   현재 노드는 첫 번째 인자로 전달받은 node다.
        *   아무것도 받지 않았으면 루트 노드다.
        * */
        TrieNode currentNode = node == null ? this.root : node;

        // 매개 값이 null이라면 빈 문자열로 초기화
        if (word == null) word = "";

        // 현재 노드의 모든 자식을 순회한다.
        for(Map.Entry<Character, TrieNode> entry : currentNode.getChildren().entrySet()){
            // 현재 키가 *이면 완전한 단어 끝에 도달했다는 뜻이므로
            // 이 단어를 words 리스트에 추가.
            if( entry.getKey() == '*' ) words.add(word);
            else
                // 아직 단어 중간이면
                // 그 자식 노드에 대해 이 함수를 재귀적으로 호출한다.
                collectAllWords(entry.getValue(), word + entry.getKey() , words );
        }
        return words;
    }
    // 자동 완성
    public List<String> autocomplete( String prefix ){
        TrieNode currentNode = search(prefix);
        return currentNode == null ? null
                :  collectAllWords( currentNode, prefix, new ArrayList<>() );
    }
}


