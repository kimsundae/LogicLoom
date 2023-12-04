package coddingProblem.backjoon.categoryProblem.setAndMap;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
/*
* 	https://www.acmicpc.net/problem/1620 나는야 포켓몬 마스터 이다솜
* */
public class SetAndMap_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer( br.readLine(), " " );
		int N = Integer.parseInt( st.nextToken() );
		int M = Integer.parseInt( st.nextToken() );

		Map<String,Integer> names = new HashMap<>();
		String[] numbers = new String[N+1];
		for( int i = 1; i <= N; i++ ){
			String pocketmon = br.readLine();
			names.put( pocketmon, i );
			numbers[i] = pocketmon;
		}

		for( int i = 0; i < M; i++ ){
			String pocketmon = br.readLine();
			if( '9' >= pocketmon.charAt(0)  )
				sb.append(numbers[Integer.parseInt(pocketmon)]).append("\n");
			else
				sb.append(names.get(pocketmon)).append("\n");
		}

		System.out.println(sb);

	}
}
