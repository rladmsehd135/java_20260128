package day4;

import java.util.Arrays;
import java.util.Random;

public class zzz {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Random ran = new Random();
		int oddcount = 0;
		int evencount = 0;
		int index = 0;
		
		//랜덤한 숫자 10개를 arr배열에 넣기
		//홀수와 짝수의 개수는 모조건 5개씩
		//랜덤한 숫자의 범위는 1~20까지
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(20)+1;
			if(evencount%2==0) {
				if(evencount==5) {
					i--;
					continue;
				}
				evencount++;
			}
			else if(oddcount%2==1) {
				if(oddcount==5) {
					i--;
					continue;
				}
				oddcount++;
			}
			arr[i]=random;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

		
