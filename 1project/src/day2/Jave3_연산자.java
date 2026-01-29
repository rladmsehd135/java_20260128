package day2;

public class Jave3_연산자 {

	public static void main(String[] args) {
		//수학에서 사용하는 사칙연산(+,-,*,/) 사용
		
		int a= 10;
		int b = 5;
		int c = 13;
		double d = 13;
		
		
		String eng = "AA";
		String eng2 ="AB";
			
		System.out.println(eng + eng2);
		System.out.println(a + b);
		System.out.println(c - b);
		System.out.println(a*c);
		//int + int의 계산이므로 결과도 int(나머지 값 사라짐)
		System.out.println(c / b);
		System.out.println(c%b);
		//int 와 double의 계산이므로 결과가 double
		System.out.println(d / b );
		//사칙연산의 결과는 더 큰 데이터 타입을 따른다.
		System.out.println((double)c / b );
		
		

	}

}
