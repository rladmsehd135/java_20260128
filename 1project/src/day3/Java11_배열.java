package day3;

import java.util.Arrays;

public class Java11_배열 {
	public static void main(String[] args) {
		//배열 선언 먼저  한 후 나중에 값을 넣기가 가능
		//배열은 고정크기를 지정해줘야 한다.
		int[] arr = new int[5]; // int[] arr = {0,0,0,0,0};
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
}
