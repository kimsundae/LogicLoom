package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		selectSort();
	}
	public static void insertSort(){
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
	public static void selectSort(){
		int[] arr = new int[]{ 5, 4, 3, 2, 1 };

		for( int i = 0; i < arr.length; i++ ){

			int lowerIndex = i;
			for( int j = i+1; j < arr.length; j++ ){
				if( arr[i] > arr[j] ){
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
	public static void bubbleSort(){
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
