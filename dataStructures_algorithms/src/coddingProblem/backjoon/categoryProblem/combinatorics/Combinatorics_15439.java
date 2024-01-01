package coddingProblem.backjoon.categoryProblem.combinatorics;


import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
*  https://www.acmicpc.net/problem/15439 베라의 패션
* */
public class Combinatorics_15439 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(N * (N-1));
    }
}