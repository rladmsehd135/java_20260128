package day2;

public class Jave2_변수 {
	public static void main(String[] args) {
		//변수는 언제든 값이 변결될 수 있다.
		//final 변수는 모두 대문자로 작성 ,'상수'라고 표현 상수=수정못하는값
		//final키워드를 붙이면 값을 변경할 수 없다.
		double height = 160.5;
		
		height = 190.5 - 2;
		
		final double PI = 3.14;
//		PI =3.14124214214; final 이므로 수정할 수 없다.
		int number = 50;
		int number2 = number + 10;
		//double이 더 큰 개념이므로 int에 담는거는 원래는 불가능
		//다만 , 강제형 변환을 통해서가능하게 할 수 있음
		//이때, 값의 손실이 발생한다
		int weight = 50;
		double weight2 = weight + 0.5;
		double weight3 = 50.5;
        int weight4 = (int) weight3; //	double을 int로 강제 변환 하는법 0.5라는 값이 손실
		System.out.println(weight4);
		System.out.println(number2);
		System.out.println(height);
		System.out.println(PI);
		
		
	}//main

}//class
