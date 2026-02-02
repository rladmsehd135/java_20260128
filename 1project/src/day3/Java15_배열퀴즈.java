package day3;

public class Java15_배열퀴즈 {
	public static void main(String[] args) {
		//가장 작은 숫자의 위치 값(index) 찾기
		int[] arr = {-1,4,-12,3,1};
		int minIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[minIndex]>arr[i]) {
				minIndex = i;
				
			}
			
		}
		System.out.println(minIndex);
	}
}
