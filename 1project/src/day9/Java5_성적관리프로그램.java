//package day9;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Java5_성적관리프로그램 {
//	static Scanner s = new Scanner(System.in);
//
//	public static int inputNumber(int first,int last) {
//		int result = 0;
//		while(true){
//			int input = s.nextInt();
//			if(input < first || input > last) {
//				System.out.println(first + "~" + last + "사이 값을 다시 입력해주세요 :");
//			}else {
//				break;
//			}
//			return result;
//	}
//	}	
//
//	public static void main(String[] args) {
//		// ==[1. 학생 추가, 2. 성적 입력, 3.종료 ]==
//
//		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
//		while (true) {
//			System.out.println("[1.학생 추가, 2. 성적입력,3 .성적 확인,4. 종료] :");
//			int menu = s.nextInt();
//			if (menu == 1) {
//				HashMap<String, Object> map = new HashMap<>();
//				System.out.print("이름 : ");
//				String name = s.next();
//				map.put("name", name);
//
//				System.out.print("나이 : ");
//				int age = s.nextInt();
//				map.put("age", age);
//				list.add(map);
//			} else if (menu == 2) {
//				System.out.println("성적을 입력할 학생의 이름을 입력 : ");
//				String name = s.next();
//				boolean studentFlg = false;
//				for (int i = 0; i < list.size(); i++) {
////					if(list.get(i).get("name").equals(name)) {	
////					}
//					HashMap<String, Object> student = list.get(i);
//					if (student.get("name").equals(name)) {
//						studentFlg = true;
//						System.out.println("자바 : ");
//						int java = inputNumber(0, 30);
//						student.put("java", java);
//						System.out.println("오라클 : ");
//						int oracle = inputNumber(0, 50);
//						student.put("oracle", oracle);
//						System.out.println("html : ");
//						int hmtl = inputNumber(0, 20);
//						student.put("hmtl", hmtl);
//
//					}
//
//				}
//				break;
//
//			}
//		
//		boolean studentFlg;
//		if (!studentFlg) {
//			System.out.println("해당 이름 학생 없습니다");
//		}
//	else if(menu==3){
//		System.out.println("성적을 확인할 학생의 이름을 입력 : ");
//		String name = s.next();
//		
//		for (int i = 0; i < list.size(); i++) {
//			studentFlg = true;
//			HashMap<String, Object> student2 = list.get(i);
//			if (student2.get("name").equals(name)) {
//				// 학생 이름은 있지만, 점수를 입력되지 않았을 때 로직 처리
//				if (!student2.containsKey("java")) {
//					System.out.println("성적 점수가 입력되지 않았습니다");
//					break;
//				}
//				}
//
//				System.out.println(student2.get("name") + "의 자바 점수는" + student2.get("java") + "의 오라클 점수는"
//						+ student2.get("oracle") + "의 html 점수는" + student2.get("html"));
//				break;
//
//			}
//
//		}
//		if (!studentFlg) {
//			System.out.println("해당 이름 학생 없습니다");
//		}
//
//	else if(menu==4){
//	
//		System.out.println("종료되었습니다");
//		break;
//	}else {
//	
//		System.out.println("1~4중에 하나를 선택해주세요.");
//	}
//		}
//}
//}
//}
