package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		main : for( int i = 0; i < T; i++ ){

			int n = Integer.parseInt(br.readLine());
			List<Integer> list = new LinkedList<>(Arrays.asList(2, 3, 5, 7));
			int nowNum = 11;

			// 1, 2, 3, 5, 7일 경우 소수 출력 후 다음 루프 진행
			switch (n){
				case 1:
					sb.append(2).append("\n");
					break;
				case 2:
					sb.append(3).append("\n");
					break;
				case 3:
					sb.append(5).append("\n");
					break;
				case 5:
					sb.append(7).append("\n");
					break;
				case 7:
					sb.append(11).append("\n");
					break;
			}// switch

			while(true){

				// 소수 판별
				boolean isPrime = true;

				for( int j = 0; j < list.size(); j++ ){

					if(  nowNum % list.get(j) == 0 ){
						isPrime = false;
						break;
					}

				}
				// 소수라면 list에 추가
				if( isPrime ) {
					// 소수인 nowNum이 입력값 n보다 크거나 같으면 출력
					if( nowNum >= n ){ sb.append(nowNum).append("\n");break;}
					list.add(nowNum);nowNum++;
				}

			}

		}
	}
}
