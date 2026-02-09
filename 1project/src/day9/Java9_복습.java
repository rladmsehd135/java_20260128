package day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Java9_복습 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<>();
		for(int i=0; i<5; i++) {
			System.out.println("뭐든 입력 : ");
			String obj = s.next();
			list.add(obj);
		}
		String txt = (String) list.get(0);
		System.out.println(Integer.parseInt(txt) + 1);
		
	}

}
