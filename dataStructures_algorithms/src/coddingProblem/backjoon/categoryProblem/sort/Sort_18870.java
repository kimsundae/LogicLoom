package coddingProblem.backjoon.categoryProblem.sort;

import java.io.*;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.StringTokenizer;

/*
 * https://www.acmicpc.net/problem/18870 좌표 압축
 */

public class Sort_18870 {

	public static void main(String[] args) throws IOException{
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				StringTokenizer st;
				int N = Integer.parseInt(bf.readLine());
				st = new StringTokenizer(bf.readLine() , " ");
				int[] arr = new int[N];
				
				for(int i = 0; i < N; i++)
					arr[i] = Integer.parseInt(st.nextToken());
			
				int[] copy = Arrays.copyOfRange(arr, 0, arr.length);
				Arrays.sort(copy);		
				//해시
				Hashtable< Integer , Integer > hash = new Hashtable<>();
				int count = 0;
				for(int i = 0; i < copy.length-1; i++) {
					
					if( copy[i] != copy[i+1] ) {
						hash.put(copy[i], count);
						count++;
					}
					
				}
				hash.put(copy[copy.length-1],count);
				
				for(int i = 0; i < arr.length; i++)
					bw.write(hash.get(arr[i]) + " ");
				
				bw.flush();			
		 	}
	}


