package day6.classEx;

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ArrayFunc {
	Scanner s = new Scanner(System.in);

	int max(int arr[]) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}

		return max;
	}

	public int arrSum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;

	}

	public int[] createRanArr(int size, int first, int last) {
		int arr[] = new int[size];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(last - first + 1) + first;
		}

		return arr;

	}

	public int[] createArr(int size) {
		int num = 0;

		int arr[] = new int[size];
		for (int j = 0; j < arr.length; j++) {
			System.out.print((j + 1) + "번째 숫자 입력: ");
			arr[j] = s.nextInt();
			if (size < 1 || size > 30) {
				System.out.println("1~30사이 숫자를 입력하세요");
				j--;
			}
		}
		return arr;

	}

	public int[] createPosisiveArr(int arr[]) {
		int size = 0;
		for(int i=0; i<arr.length; i++) {
			size = arr[i] > 0 ? ++size : size;
		}
		
		int newArr[] = new int[size];
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				newArr[j++] = arr[i];
			}
		}
		
		return newArr;
		
	}
	public int[] createOddArr(int arr[]) {
		int size = 0; //홀수 수만큼 배열 저장
		for(int i=0; i<arr.length; i++) {
			size = arr[i]%2==1 ? ++size : size;
		}
		
		int OddArr[] = new int[size]; // 
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				OddArr[j++] = arr[i];
			}
		}
		
		return OddArr;
		
	}
}
