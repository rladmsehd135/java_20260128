package day4;

import java.util.Arrays;

public class Java2_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 2 ,4, 1};
		
		
		
		int maxIndex = 0;
		int minIndex = 0;
		
		for(int i=0; i<=arr.length; i++) {
			if(arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
				
			}
		
		}
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex]=temp;
		
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
