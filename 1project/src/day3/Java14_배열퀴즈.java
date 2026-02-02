package day3;

public class Java14_배열퀴즈 {
	public static void main(String[] args) {
		//가장 큰 숫자의 위치 값(index) 찾기
		
		int[] arr = {5,4,12,3,1};
		int maxIndex = 0; //큰 숫자 위치 백업
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>arr[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
	}
}
