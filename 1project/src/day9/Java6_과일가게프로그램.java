package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java6_과일가게프로그램 {
	static Scanner s = new Scanner(System.in);

	public static int inputNumber(int first, int last) {
		int result = 0;
		while (true) {
			result = s.nextInt();
			if (result < first || result > last) {
				System.out.println(first + "~" + last + "사이 값을 다시 입력해주세요 :");
			} else {
				break;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while (true) {
			System.out.println("{1.과일 등록, 2.과일 판매,3. 가격 수정, 4종료] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				// 1.과일 등록 과일이름(name), 개수(count), 가격(price)
				// 입력받아서 map에 저장후 리스트에 추가
				// 개수는 0~200사이, price는 0~10000사이 값

				// +동일한 이름의 과일이 있을 경우
				// 가격은 물어보지 않고, 개수만 입력 받아서 기존 개수에 더하기
				HashMap<String, Object> map = new HashMap<>();
				Boolean fruitFlg = false;
				System.out.print("이름 :");
				String name = s.next();
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map2 = list.get(i);
					if (map2.get("name").equals(name)) {
						fruitFlg = true;
						System.out.print("개수 : ");
						int count = inputNumber(1, 200);
						map2.put("count", (int) map2.get("count") + count);
						break;
					}
				}
				if(!fruitFlg) {
					map.put("name", name);

					System.out.print("개수 : ");
					int count = inputNumber(1, 200);
					map.put("count", count);

					System.out.print("가격 : ");
					int price = inputNumber(100, 1000);
					map.put("price", price);

					list.add(map);
					
				}
				

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {

			}
		}

	}

}
