package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.*;

public class Main {
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken()) , M = Integer.parseInt(st.nextToken());
		// 명단
		Set< String > names = new HashSet<>();
		// 듣보잡 명단
		TreeSet< String > noHearAndSeeNames = new TreeSet<>();
		// 듣도 못한 사람 names 저장
		for( int i = 0; i < N; i++ )
			names.add(br.readLine());

		// 보도 못한 사람 저장
		for( int i = 0; i < M; i++ ){

			String noSeePerson = br.readLine();
			// 만약 보도못한 사람이 중복 된다면 듣보잡 명단에 추가
			if( !names.add(noSeePerson) )
				noHearAndSeeNames.add(noSeePerson);

		}

		Iterator< String > iterator = noHearAndSeeNames.iterator();
		sb.append(noHearAndSeeNames.size()).append("\n");

		while(iterator.hasNext() ){
			sb.append(iterator.next()).append("\n");
		}

		System.out.println(sb);

	}*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken()) , M = Integer.parseInt(st.nextToken());
		// 명단
		Set< String > names = new HashSet<>();
		// 듣보잡 명단
		List< String > noHearAndSeeNames = new ArrayList<>();
		// 듣도 못한 사람 names 저장
		for( int i = 0; i < N; i++ )
			names.add(br.readLine());

		// 보도 못한 사람 저장
		for( int i = 0; i < M; i++ ){

			String noSeePerson = br.readLine();
			// 만약 보도못한 사람이 중복 된다면 듣보잡 명단에 추가
			if( !names.add(noSeePerson) )
				noHearAndSeeNames.add(noSeePerson);

		}

		Collections.sort(noHearAndSeeNames);

		sb.append(noHearAndSeeNames.size()).append("\n");
		for(int i = 0; i < noHearAndSeeNames.size(); i++)
			sb.append(noHearAndSeeNames.get(i)).append('\n');

		System.out.println(sb);

	}
}
