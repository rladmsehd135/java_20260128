package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Java16_배열퀴즈 {
	
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		//1. 5개의 공간을 가지는 배열을 선언
//		//2. 해달 배열에 숫자를 입력 받아서 넣기
//		//3. 1미만(0이하)의 숫자는 입력하면 배열에 넣지 말고 다시 입력하도록
//		int[] arr = new int[5];
//		int index =0;
//		for(;;) {
//			System.out.print((index+1) + "번째 숫자 입력 : ");
//			arr[index] = s.nextInt();
//			//arr[index] 값이 0이하 인지 체크
//			if(arr[index] < 1) {
//				System.out.println("1이상의 숫자를 입력해주세요.");
//				continue;
//			}
//			index++;
//			if(index == arr.length) {
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+ "번째 숫자 입력 : ");
			arr[i] = s.nextInt();
			if(arr[i]<1) {
				System.out.println("1이상의 숫자를 입력해수제요.");
				i--;
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
