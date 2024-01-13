package coddingProblem.backjoon.nowSolving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int[] sorted;
    static int count = 0;
    static int K;

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N]; int index = 0;
        for(int i = 0; i < arr.length; i++)
            arr[index++] = Integer.parseInt(st.nextToken());

        merge_sort(arr);
        if( K > count )
            System.out.println(-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void merge_sort(int[] a) {

        sorted = new int[a.length];
        merge_sort(a, 0, a.length - 1);
    }
    private static void merge_sort(int[] a, int left, int right) {

        for(int size = 1; size <= right; size += size) {

            for(int l = 0; l <= right - size; l += (2 * size)) {
                int low = l;
                int mid = l + size - 1;
                int high = Math.min(l + (2 * size) - 1, right);
                merge(a, low, mid, high);		// 병합작업
            }
        }

    }
    private static void merge(int[] a, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;


        while(l <= mid && r <= right) {
            if(a[l] <= a[r]) {
                sorted[idx] = a[l];
                idx++;
                l++;
            }
            else {
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }


        if(l > mid) {
            while(r <= right) {
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }

        else {
            while(l <= mid) {
                sorted[idx] = a[l];
                idx++;
                l++;
            }
        }

        for(int i = left; i <= right; i++) {
            if( ++count == K )
                System.out.println(sorted[i]);
            a[i] = sorted[i];
        }
    }
}