package day3;
import java.util.Arrays;
import java.util.Scanner;
public class Java12_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		int[] arr = new int[5];
		
		for(int i =0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 숫자 입력: ");
			arr[i] = s.nextInt();
			
			
		}
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("평균 값 : " + (sum/arr.length));

	}

}
