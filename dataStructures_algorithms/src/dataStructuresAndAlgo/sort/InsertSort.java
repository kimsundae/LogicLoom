package dataStructuresAndAlgo.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{ 5, 4, 3, 2, 1 };
        for( int i = 1; i < arr.length; i++ ){
            int position = i-1;
            int tmpValue = arr[i];
            while( position >= 0 ){

                if( arr[position] > tmpValue ){
                    arr[position+1] = arr[position];
                    position -= 1;
                }else{
                    break;
                }

            }
            arr[position + 1] = tmpValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
