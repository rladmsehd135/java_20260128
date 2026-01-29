package day2;

public class Java22_반족문키워드 {
	public static void main(String[] args) {
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			if(i == 5) {				
//				break;
//			}	
//		}
		//break는 빠져 나오게 도와준다
		
		//continue는 곧바로 반복문의 증감식으로 이동
		for(int i=1; i<=10; i++) {
			
			if(i == 5) {				
				continue;
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}
}
