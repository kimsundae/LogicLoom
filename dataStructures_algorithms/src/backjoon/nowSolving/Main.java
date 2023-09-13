package backjoon.nowSolving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer( bf.readLine() , " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] set = new String[N+M];
		
		int index = N;
		
		
		for(int i=0; i<N; i++) 
			set[i] = bf.readLine();
		
		for(int i=N; i<=M+N; i++) {
						
			boolean result = false;
			String temp = bf.readLine();
			for(int j=0; j<N; j++) {
				if(set[j].equals(temp))
					result = true;
					
			}
			if( !result ) {
				set[index++] = temp;
			}
			
				
			
				
		}
			
	}		
}
