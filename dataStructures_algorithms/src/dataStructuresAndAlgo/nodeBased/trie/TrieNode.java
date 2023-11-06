package dataStructuresAndAlgo.nodeBased.trie;

import java.util.HashMap;
import java.util.Map;
/*
*  트라이 노드
* */
public class TrieNode {
    private Map<Character, TrieNode> children;
    public TrieNode(){
        children = new HashMap<>();
    }
    public Map<Character, TrieNode> getChildren(){return children;}
}



