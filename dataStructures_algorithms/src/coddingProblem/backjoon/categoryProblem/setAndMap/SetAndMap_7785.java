package coddingProblem.backjoon.categoryProblem.setAndMap;


import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
/*
* 	https://www.acmicpc.net/problem/7785 회사에 있는 사람
* */
public class SetAndMap_7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		// 출입한 인원 수
		int n = Integer.parseInt(br.readLine());
		// 해시셋
		Set<String> set = new HashSet<>();

		for( int i = 0; i < n; i++ ){

			st = new StringTokenizer(br.readLine(), " ");

			String memberName = st.nextToken();

			// set에 사원 명이 포함 되어있지 않으면 add
			if( !set.contains( memberName ) )
				set.add( memberName );
			// 포함 되어있으면 삭제
			else
				set.remove( memberName );

		}

		set.stream().sorted( (a,b) -> b.compareTo(a) ).forEach( e -> {
			try {
				bw.write(e+"\n");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		bw.flush();

	}
}
