package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java4_ListMap {
	//3명에서 사람의 정보를 입력받아서 리스트 안에 저장
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		for(int i=0; i<3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 : ");
			String name = s.next();
			map.put("name", name);
			
			System.out.print("나이 : ");
			int age = s.nextInt();
			map.put("age", age);
			list.add(map);
			
			System.out.print("자바 : ");
			int java = s.nextInt();
			map.put("java", java);
			list.add(map);
			
		}
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			if((int)user.get("java") < 60) {
				user.put("java", 60);
				
			}
		}
		System.out.println(list);
	}
	
	
}
