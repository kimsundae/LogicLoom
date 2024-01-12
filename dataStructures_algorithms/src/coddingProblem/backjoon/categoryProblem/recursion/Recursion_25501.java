package coddingProblem.backjoon.categoryProblem.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
* https://www.acmicpc.net/problem/25501 재귀의 귀재
* */
public class Recursion_25501 {

    public static String recursion( String S, int l, int r, int callCount ){
        callCount++;
        if(l >= r) return 1+" "+callCount;
        else if(S.charAt(l) != S.charAt(r)) return 0+" "+callCount;
        else return recursion(S, l+1, r-1, callCount);
    }
    public static String isPalindrome( String S ){
        return recursion(S, 0, S.length()-1, 0);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while( N-- > 0 ){
            String S = br.readLine();
            sb.append(isPalindrome(S)).append("\n");
        }
        System.out.println(sb);
    }
}
