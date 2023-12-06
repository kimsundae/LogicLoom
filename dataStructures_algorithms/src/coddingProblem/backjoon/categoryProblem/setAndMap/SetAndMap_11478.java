package coddingProblem.backjoon.categoryProblem.setAndMap;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
/*
 *   https://www.acmicpc.net/problem/11478 서로 다른 부분 문자열
 * */
public class SetAndMap_11478 {

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = 1;
            String s = br.readLine();
            Set<String> set = new HashSet<>();
            while( num != s.length() ) {
                for( int i = 0 ; i < s.length()-num+1; i++ ) {
                    set.add( s.substring( i, num + i) );
                }
                num++;
            }
            set.add(s);
            System.out.println( set.size() );

    }
}
