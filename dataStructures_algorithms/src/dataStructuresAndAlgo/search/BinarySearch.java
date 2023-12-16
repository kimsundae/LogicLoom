package dataStructuresAndAlgo.search;
/*
* p.58 이진검색
* */
public class BinarySearch {
    public static int binarySearch( int[] arr, int searchValue ){
        // 먼저 찾으려는 값이 있을 수 있는 상한선과 하한선을 정한다.
        // 최초의 상한선은 배열의 첫 번째 값, 하한선은 마지막 값이다.
        int lowerBound = 0;
        int upperBound = arr.length-1;
        // 상한선과 하한선 사이의 가운데 값을 계속해서 확인하는 루프를 시작한다.
        while( lowerBound <= upperBound ){
            // 상한선과 하한선 사이에 중간 지점을 찾는다.
            int midpoint = (upperBound + lowerBound) / 2;
            // 중간 지점의 값을 확인한다.
            int valueAtMidPoint = arr[midpoint];
            // 중간 지점의 값이 찾고 있던 값이면 검색을 끝낸다.
            // 그렇지 않으면 더 클지 작을지 추측한 바에 따라 상한선이나 하한선을 바꾼다.
            if( searchValue == valueAtMidPoint )
                return midpoint;
            else if( valueAtMidPoint > searchValue )
                upperBound = midpoint - 1;
            else if( searchValue > valueAtMidPoint )
                lowerBound = midpoint + 1;
        }
        return -1;
    }
}
