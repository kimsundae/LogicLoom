package dataStructuresAndAlgo.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{ 5, 4, 3, 2, 1 };

        for( int i = 0; i < arr.length; i++ ){

            int lowerIndex = i;
            for( int j = i+1; j < arr.length; j++ ){
                if( arr[lowerIndex] > arr[j] ){
                    lowerIndex = j;
                }
            }
            if( lowerIndex != i ){
                int tmp = arr[i];
                arr[i] = arr[lowerIndex];
                arr[lowerIndex] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
