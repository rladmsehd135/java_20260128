package day3;

import java.util.Arrays;

public class Jave19_과제 {

    public static void main(String[] args) {

        int[] arr = { 3, 5, 2, 4, 1 };

        int minIndex = 0;
        int maxIndex = 0;

        // 최솟값, 최댓값의 인덱스 찾기
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        // 위치 교환 (swap)
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        // 결과 출력
       
            System.out.print(Arrays.toString(arr));
        
    }
}

