package day2;

public class Java7_비교연산자 {
	
	public static void main(String[] args) {
		//크다, 작다,같다, 다르다
		int a = 10;
		int b = 5;
		
		System.out.println(a==b);//false
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		System.out.println(a<3);//false
		System.out.println(a>=10);//true
		System.out.println(b>=5);//true
		System.out.println(b != 5);//true !부정의의미 고로 != 다르냐 라는뜻
		
		System.out.println(!true); //false
		System.out.println(!(a == 10)); //false !를 붙였기 때문
		
	}

	
	
}
