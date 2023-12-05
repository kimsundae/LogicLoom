package dataStructuresAndAlgo.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
            int[] arr = new int[]{ 5, 4, 3, 2, 1 };
            boolean isSorted = false;
            int untilIndex = arr.length - 1;
            while( !isSorted ){

                isSorted = true;
                for( int i = 0; i < untilIndex; i++ ){
                    if( arr[i] > arr[i+1] ){
                        int tmp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = tmp;
                        isSorted = false;
                    }
                }
                untilIndex -= 1;
            }
            System.out.println(Arrays.toString(arr));

    }
}
