package coddingProblem.backjoon.nowSolving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    static int[] sortedArr = null;
    static int count = 0;
    static int K = 0;
    public static void sort(int[] arr, int left, int right) {
        sortedArr = new int[arr.length];
        mergeSort(arr, left, right);
    }
    public static void mergeSort(int[] arr, int left, int right){

        if(left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){

        int l = left;
        int r = mid+1;
        int sortedIndex = left;
        while(l <= mid && r <= right){
            if(arr[l] <= arr[r])
                sortedArr[sortedIndex++] = arr[l++];
            else
                sortedArr[sortedIndex++] = arr[r++];
        }
        if(l > mid){
            for(int i = r; i <= right; i++){
                sortedArr[sortedIndex] = arr[i];
            }
        }else {
            for(int i = l; i <= mid; i++){
                sortedArr[sortedIndex++] = arr[i];
            }
        }

        for(int i=left; i<=right; i++) {
            if(++count == K)
                System.out.println(sortedArr[i]);
            arr[i] = sortedArr[i];
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N]; int index = 0;
        for(int i = 0; i < arr.length; i++)
            arr[index++] = Integer.parseInt(st.nextToken());

        sort(arr, 0 , arr.length-1);
        if( K > count )
            System.out.println(-1);
        System.out.println(Arrays.toString(sortedArr));

    }
}
