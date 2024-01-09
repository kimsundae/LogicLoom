package coddingProblem.backjoon.categoryProblem.deepening2;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
/*
*  https://www.acmicpc.net/problem/25192 인사성 밝은 곰곰이
* */
public class Deepening2_25192 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        Set<String> set = null;
        while( N-- > 0 ){

            String nickName = br.readLine();

            if( "ENTER".equals(nickName) )
                set = new HashSet<>();
            else if ( set.add(nickName) )
                count++;

        }
        System.out.println(count);
    }
}