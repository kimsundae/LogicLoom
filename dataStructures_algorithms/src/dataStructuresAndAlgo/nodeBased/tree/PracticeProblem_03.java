package dataStructuresAndAlgo.nodeBased.tree;

/*
*   346p 3번 문제.
*        이진 탐색 트리에서 가장 큰 값을 찾는 알고리즘 작성
*
*   //계속 오른쪽으로 내려가면 될 것 같다.
* */
public class PracticeProblem_03 extends TreeNode{

    public PracticeProblem_03(int val){ super(val); }
    public TreeNode searchBiggestVal( TreeNode node ){
        // 기저 조건 오른쪽 자식이 null이면 현재 노드를 반환
        if( node.getRightChild() == null ) return node;
        else return searchBiggestVal(node.getRightChild());
    }
    public static void main(String[] args) {
        PracticeProblem_03 root = new PracticeProblem_03(10);
        System.out.println("node = " + root);
        root.insert(2 , root);
        root.insert(1,root);
        root.insert( 6, root);
        root.insert( 11 , root);
        root.insert( 15, root);
        root.insert( 21 , root);
        root.insert( 13 , root);
        // 중위 순회
        root.traverseAndPrint( root );
        // 가장 큰 값 찾기
        System.out.println(root.searchBiggestVal( root ).getValue());
        // result: 21
    }
}
