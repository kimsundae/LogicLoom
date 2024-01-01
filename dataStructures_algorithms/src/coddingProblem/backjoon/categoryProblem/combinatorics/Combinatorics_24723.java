package coddingProblem.backjoon.categoryProblem.combinatorics;


import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
*  https://www.acmicpc.net/problem/24723 녹색거탑
* */
public class Combinatorics_24723 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int top = Integer.parseInt(br.readLine());

        switch (top){
            case 1:
                System.out.println(2);
                break;
            case 2:
                System.out.println(4);
                break;
            case 3:
                System.out.println(8);
                break;
            case 4:
                System.out.println(16);
                break;
            case 5:
                System.out.println(32);
                break;
        }
    }
}