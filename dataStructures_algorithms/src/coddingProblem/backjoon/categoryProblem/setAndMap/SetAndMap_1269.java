package coddingProblem.backjoon.categoryProblem.setAndMap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
/*
 * https://www.acmicpc.net/problem/1269 대칭차집합
 * */
public class SetAndMap_1269 {

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
            StringTokenizer st;
            st = new StringTokenizer( br.readLine() , " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            Set<String> setA = new HashSet<>(), setB = new HashSet<>();
            int countA = 0, countB = 0;
            st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < a; i++ ) {
                setA.add(st.nextToken());countA++;
            }
            st = new StringTokenizer(br.readLine(), " ");
            for( int i = 0; i < b; i++ ) {
                String temp = st.nextToken();
                setB.add(temp);countB++;
                if(setA.contains(temp)) {
                    countA--;
                }
            }

            Iterator<String> i = setA.iterator();
            while(i.hasNext()) {
                if(setB.contains( i.next() )) {
                    countB--;
                }
            }

            System.out.print(countA+countB);

    }
}
