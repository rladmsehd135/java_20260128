package day9;

import java.util.ArrayList;
import java.util.HashMap;

public class Java3_Json {
	public static void main(String[] args) {
		//Json -> list안에 map이 있는 형태
		//[{},{},{}]
		//[{},{}]
		HashMap<String,Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("java", "95");
		hong.put("oracle", "95");
		hong.put("html", "85");
		
		HashMap<String,Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("java", 50);
		kim.put("oracle", 80);
		kim.put("html", 80);
		
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		list.add(hong);
		list.add(kim);
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
//			HashMap<String,Object> map = list.get(i);
//			System.out.println(map.get("name") + "의 자바 점수는" + map.get("java"));
			System.out.println(list.get(i).get("name")+ "의 자바 점수는" + list.get(i).get("java"));
		}
		
	}
}
