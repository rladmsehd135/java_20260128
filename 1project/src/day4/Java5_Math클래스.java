package day4;

import java.util.Arrays;

public class Java5_Math클래스 {
	public static void main(String[] args) {
		
		int arr[] = {-4,3,10,-2,5};
		// 배열안에 있는 모든 숫자를 양수로 변경
		//음수인 숫자들을 양수로 
		int max = Math.abs(arr[0]);
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				arr[i]=Math.abs(arr[i]);			
			}
			if(Math.abs(arr[i])>max){
				max = Math.abs(arr[i]);
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
	}
}
