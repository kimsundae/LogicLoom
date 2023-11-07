package dataStructuresAndAlgo.nodeBased.trie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
*   401p 4 오탈자를 올바른 단어로 바꿔주는 autocorrect 함수 작성
* */
public class PracticeTrie_04 extends Trie{
    // 아이디어1 : 입력받은 문자열에서 끝 문자를 하나씩 제거해간다.
    // 끝 문자를 제거한 문자와 일치하는 문자가 발견되면 반환한다.


    // 요구사항은 주어진 데이터 내에서 일치하는 아무 값이나 리턴하는 것.
    public String autoCorrect( String word ){
        // 검색 결과를 현재 노드에 대입
        TrieNode currentNode = search( word );
        String currentWord = word;
        while(true){
            // 만약 검색 결과 노드가 null이라면
            // 문자열의 마지막 문자를 제거하고
            // 다시 검색하여 currentNode에 대입
            if( currentNode == null ){
                currentWord = currentWord.substring( 0, currentWord.length()-1 );
                currentNode = search( currentWord );
            }
            // 검색 결과 노드가 null이 아니라면
            // 현재 문자열과 다음 key 문자를 더한 값을 반환
            else {
                Iterator<Character> keys = currentNode.getChildren().keySet().iterator();
                return currentWord + keys.next();
            }
        }
    }


    public static void main(String[] args) {
        PracticeTrie_04 node = new PracticeTrie_04();
        // 예제 데이터 cat, catnap, catnip
        // 사용자의 입력 catnar
        node.insert("cat");
        node.insert("catnap");
        node.insert("catnip");
        System.out.println("result = " + node.autoCorrect("catnar"));
        // result = catnap
    }
}
