package day1;

public class Java2_변수 {

	public static void main(String[] args) {
		//변수는 정보를 담는 공간
		//이름 : 홍길동 => 문자열은 string, 값을 담을 때는 equal(=)를 사용
		//정수는 int or long, int는 -21억 + +21억까지만 나타낼수 있음 2의32승까지만 가능(4바이트)
		//long은 21억 이상
 		String name = "홍길동";
		String gender = "남자";
		int age = 30;
		double height = 170.5;
		boolean isMarried = false;
		
		System.out.println("이름:"+name);
		System.out.println("성별:"+gender);
		System.out.println("나이:"+age);
		System.out.println("키:"+ height);
		System.out.println("결혼여부:"+isMarried);
		
		//변수는 변수이름 앞에 데이터 타입이 붙어야 한다.
		//[문자 : string] , [정수 : int], [실수는 double], [참거짓은 boolean]
		//변수는 한글 비추 호환성 문제 공유문제 영문 추천
		//변수 이름은 첫글자는 소문자 ,카멜(camel)표기법 권장 
		//카멜표기법은 2개 이상의 단어가 조합되었을 때 두번째 단어부터 첫글자를 대문자로 한다.
		//ex)학번 (student + number) => studentNumber
		//변수안에 들어간 값은 언제든 바꿀 수 있다.
	}//main

}//class
