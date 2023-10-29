package CoddingProblem.externalSite;

import java.util.HashMap;
import java.util.StringTokenizer;

/*
*   프로젝트 오일러 https://euler.synap.co.kr/quiz=1
*   '얼른 마스크'씨 회사 전기자동차의 행복한 일련번호
* */
public class HappyNum {
    // 행복의 수 판별 메서드
    public static boolean isHappyNum( int num ){

        // 입력값 num을 char배열로 변환
        char[] numArr = String.valueOf(num).toCharArray();
        // 매 합계를 기억하여 루프를 방지
        HashMap< Integer, Boolean > sumArr = new HashMap<>();
        // 각 자리수 총합
        int sum = 0;

        // sum이 1이 아닐 때까지 반복
        while( sum != 1 ) {
            // sum 저장
            if (sumArr.containsKey(sum))
                return false;
            else
                sumArr.put(sum, true);

            // sum 초기화
            sum = 0;

            // numArr의 자리수만큼 반복
            for (int i = 0; i < numArr.length; i++)
                sum += (int) Math.pow(numArr[i] - 48, 2);

            // 새로 합산한 sum을 numArr char배열로 변환
            numArr = String.valueOf(sum).toCharArray();
        }

        return true;
    }

    public static void main(String[] args) {
        StringBuilder happyNum = new StringBuilder();
        for( int i = 1; i <= 9999; i ++){
            // 행복의 수 판별 메서드 true 반환 시 i는 행복의 수
            if(isHappyNum( i )){
                happyNum.append(i).append(" ");
            }
        }
        StringTokenizer st = new StringTokenizer( happyNum.toString() , " " );
        // 행복의 수 개수
        int happyNumCount = st.countTokens();
        // 행복의 수의 개수만큼 sum 변수에 행복의 수를 더하기
        int sum = 0;
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println("1~9999 범위의 행복 수는 " + happyNumCount +"개이고 총합은 " + sum + "입니다.");
    }
}
