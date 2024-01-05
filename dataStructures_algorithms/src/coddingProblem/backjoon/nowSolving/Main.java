package coddingProblem.backjoon.nowSolving;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main{
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