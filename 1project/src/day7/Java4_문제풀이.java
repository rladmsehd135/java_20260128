package day7;

import java.util.Arrays;
import java.util.Random;

import day6.classEx.ArrayFunc;


public class Java4_문제풀이 {
	public static void main(String[] args) {
		//1~30사이 숫자를 10개의 공간을 가지는 배열에 넣기
		Random ran = new Random();
		ArrayFunc func = new ArrayFunc();
		int[] arr = new int [10];
		int[] oddArr;
		int[] evenArr;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(30)+1;
			
			
		}
		System.out.println(Arrays.toString(arr));
		oddArr = func.createOddArr(arr);
		System.out.println(Arrays.toString(oddArr));
		evenArr = func.createEvenArr(arr);
		System.out.println(Arrays.toString(evenArr));
		
	
		
		
	}
}
