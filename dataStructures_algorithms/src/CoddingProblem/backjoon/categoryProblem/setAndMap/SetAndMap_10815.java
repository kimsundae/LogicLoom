package CoddingProblem.backjoon.categoryProblem.setAndMap;
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.StringTokenizer;


/*
 * https://www.acmicpc.net/problem/10815 숫자 카드
 */
public class SetAndMap_10815 {	
	// 해시 Map
	public static void solvingProblem_HashMap() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
				
		int N = Integer.parseInt(bf.readLine());
		HashMap<Integer, Boolean> map = new HashMap<>();
		st = new StringTokenizer(bf.readLine() , " ");
		for(int i = 0 ; i < N; i++) 
			map.put(Integer.parseInt(st.nextToken()), true );
				
		int M = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine() , " ");
		for(int i = 0; i < M; i++)
			bw.write((map.containsKey(Integer.parseInt(st.nextToken())) == true ? 1 : 0) + " ");
				
		bw.flush();
	}
    // 해시 Set
	public static void solvingProblem_HashSet() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
				
		int N = Integer.parseInt(bf.readLine());
		HashSet<Integer> set = new HashSet<>();		
		st = new StringTokenizer(bf.readLine() , " ");
		for(int i = 0; i < N; i++)
			set.add(Integer.parseInt(st.nextToken()));
		
		int M = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine() , " ");
		for(int i = 0; i < M; i++)
			bw.write((set.contains(Integer.parseInt(st.nextToken())) ? 1 : 0 )+ " ");
		
		bw.flush();
	}
    // 해시 테이블
    public static void solvingProblem_Hashtable() throws IOException{
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
	
	public static void main(String[] args) throws IOException { 
		solvingProblem_HashSet();
	}
}

	


