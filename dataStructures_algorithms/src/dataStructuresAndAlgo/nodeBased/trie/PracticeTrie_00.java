package dataStructuresAndAlgo.nodeBased.trie;

import java.util.List;

/*
*   00 연습
* */
public class PracticeTrie_00 {
    public static void main(String[] args) {
        //"get","go","got","gotten","hall","ham","hammer","hill","zebra"
        Trie rootNode = new Trie();
        rootNode.insert("get"); rootNode.insert("go");
        rootNode.insert("got"); rootNode.insert("gotten");
        List<String> result  = rootNode.autocomplete("g");
        System.out.println("result = " + result);
        // [get, gotten, got, go]
    }
}
