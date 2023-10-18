package dataStructuresAndAlgo.nodeBased.binarySearchTree;
/*
*   346p 5번 연습 문제
*       후위(postorder) 순회라는 방법도 있다.
*
* */
public class PracticeProblem_05 extends TreeNode{

    public PracticeProblem_05(int val){ super(val); }

    // 후위(postorder) 순회
    public void traverseAndPrint( TreeNode node ){
        if( node == null ) return;
        traverseAndPrint( node.getLeftChild() );
        traverseAndPrint( node.getRightChild() );
        System.out.println(node.getValue());
    }
    public static void main(String[] args)  {
        PracticeProblem_05 root = new PracticeProblem_05(10);
        root.insert(2 , root);
        root.insert(1,root);
        root.insert( 6, root);
        root.insert( 11 , root);
        root.insert( 15, root);
        root.insert( 21 , root);
        root.insert( 13 , root);
        root.traverseAndPrint( root );
        // result :
        //  1
        //  6
        //  2
        //  13
        //  21
        //  15
        //  11
        //  10
    }
}
