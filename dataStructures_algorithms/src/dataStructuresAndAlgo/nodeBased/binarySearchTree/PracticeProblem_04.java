package dataStructuresAndAlgo.nodeBased.binarySearchTree;
/*
*   346p 4번 문제
*       전위 순회로 순서대로 출력하기
*
* */
public class PracticeProblem_04 extends TreeNode{

    public PracticeProblem_04(int val){ super(val); }
    // 전위 순회
    public void traverseAndPrint( TreeNode node ){
        if( node == null ) return;
        System.out.println(node.getValue());
        traverseAndPrint( node.getLeftChild() );
        traverseAndPrint( node.getRightChild() );
    }

    public static void main(String[] args) {
        PracticeProblem_04 root = new PracticeProblem_04(10);
        root.insert(2 , root);
        root.insert(1,root);
        root.insert( 6, root);
        root.insert( 11 , root);
        root.insert( 15, root);
        root.insert( 21 , root);
        root.insert( 13 , root);
        // 전위 순회
        root.traverseAndPrint( root );
        // result:
        // 10
        //  2
        //  1
        //  6
        //  11
        //  15
        //  13
        //  21

    }
}
