package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java7 {	
	static void test() {
		System.out.println("매개변수 없는 메소드!");
		};
	static void test(int x) {System.out.println("매개변수 1개!");}

	static int test(int x , int y) {
		System.out.println("매개 변수 2개!");
		return x+y;
		};
	static void test(HashMap<String, Object> map) {};
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		//클래스 만드는거(변수 + 메소드) 메소드 생성 및 호출
		test(10);
		int a = test(5,10);
		ArrayList<String> stringList = new ArrayList<>();
		//스캐너로 값을 입력받아서 stringList에 순서대로 넣기
		//stop 이라고 입력하는 순간 더이상 입력안받고 종료
		while(true) {
			System.out.println("문자열 입력 : ");
			String text = s.next();
			if(text.toLowerCase().equals("stop")) {
				System.out.println("종료되었습니다.");
				break;
			}
			stringList.add(text);
			
		}
		System.err.println(stringList);
	}

}
