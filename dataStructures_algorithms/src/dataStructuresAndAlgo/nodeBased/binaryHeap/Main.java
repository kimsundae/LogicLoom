package dataStructuresAndAlgo.nodeBased.binaryHeap;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CusHeap<Integer> heap = new CusHeap<>();
        heap.insert( 100 );
        heap.insert( 88 );
        heap.insert(25);
        heap.insert( 87 );
        heap.insert( 16 );
        heap.insert(8);
        heap.insert( 12 );
        heap.insert( 3);
        heap.insert(50);
        heap.printHeap();

    }
}
