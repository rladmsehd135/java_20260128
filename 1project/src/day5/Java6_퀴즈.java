package day5;

import java.util.Arrays;

public class Java6_퀴즈 {
	public static void main(String[] args) {

		int arr[] = { 2, -4, 5, -1, -3 };
		// 문제를 풀이할 때, 별다르 조건이 없으면(ex, 선택정렬을 쓰세요)
		// Arrays.sort(arr);
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		// 선택 or 버블 정렬 편한 방식 이용해서 배열을 정렬. 단, 음수를 양수 취급할 것
//		for (int j = 1; j < arr.length; j++) {
//			for (int i = 0; i < arr.length-j; i++) {
//				int x = arr[i] < 0 ? -arr[i] : arr[i];
//				int y = arr[i+1] < 0 ? -arr[i+1] : arr[i+1];
//			
//				if(x>y) {
//					int temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1]=temp;	
//				}
//				
//				
//			}
//			System.out.println(Arrays.toString(arr));
//
//		}
		for(int j=1; j<arr.length; j++) {
			for(int i=0; i<arr.length-j;i++) {
				if(Math.abs(arr[i]) > Math.abs(arr[i+1])) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
							
				}
			}
			System.out.println(Arrays.toString(arr));
			//{2,4,1,3,5} , {2,-4,-1,5,-3}
		}
		
	}
}
