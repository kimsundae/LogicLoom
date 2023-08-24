package backjoon.categoryProblem.setAndMap;
import java.io.*;
import java.util.Hashtable;
import java.util.StringTokenizer;


/*
 * https://www.acmicpc.net/problem/10815 숫자 카드
 */
public class setAndMap_10815 {	
	public static void main(String[] args) throws IOException { 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
				
		int N = Integer.parseInt(bf.readLine());
		Hashtable<Integer, Boolean> table = new Hashtable<>();
		st = new StringTokenizer(bf.readLine() , " ");
		for(int i = 0 ; i < N; i++) 
			table.put(Integer.parseInt(st.nextToken()), true );
				
		int M = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine() , " ");
		for(int i = 0; i < M; i++)
			bw.write((table.containsKey(Integer.parseInt(st.nextToken())) == true ? 1 : 0) + " ");
				
		bw.flush();
	}
}

	


