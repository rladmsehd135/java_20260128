package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Java5_성적관리프로그램 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		ArrayList<String> stuNoList = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		// 1번 메뉴 -> 학생 추가,2번 메뉴 ->성적 입력, 3번 메뉴 -> 성적조회 4번 메뉴 ->종료, 그외 숫자 다시이렵
		while (true) {
			try {
				System.out.println("[1.학생추가, 2. 성적입력, 3. 성적조회, 4.종료 ]");
				int meun = s.nextInt();
				if (meun == 1) {
					Boolean stuNoFlg = true;
					String stuNo ="";
					while(stuNoFlg) {
						System.out.println("학번을 입력하세요 : ");
						stuNo = s.next();
						stuNoFlg = stuNoList.contains(stuNo);
						if(stuNoFlg) {System.out.println("중복된 학번있음!!");}
					}
					System.out.println("이름을 입력하세요 : ");
					String name = s.next();
					System.out.println("나이를 입력하세요 : ");
					int age = s.nextInt();
					Student stu = new Student(stuNo, name, age);
					stuNoList.add(stuNo);
					list.add(stu);

				} else if (meun == 2) {
					// 학번을 입력받아서 해당 한벅 학생의 자바, 오라클, html점수 입력받아서 저장
					// 해당하는 학번 없을 경우 '해당 학번을 가진 학생이 없습니다' 풀력후 메뉴로 이동
					System.out.println("학번입력하세요 :");
					String stuNo = s.next();
					boolean as = false;
					for (int i = 0; i < list.size(); i++) {

						Student stu = list.get(i);
						if (stuNo.equals(stu.getStuNO())) {
							as = true;
							stu.setJava();
							stu.setOracle();
							System.out.println("html 점수 입력");
							int html = s.nextInt();
							stu.setHtml(html);
						}

					}
					if (!as) {
						System.out.println("해당 학번을 가진 학생이 없습니다.");
					}

				} else if (meun == 3) {
					for (int i = 0; i < list.size(); i++) {
						Student stu = list.get(i);
						System.out.print("학번 :" + stu.getStuNO() + ", ");
						System.out.print("이름 :" + stu.getName() + ", ");
						System.out.print("자바 :" + stu.getJava() + ", ");
						System.out.print("오라클 :" + stu.getOracle() + ", ");
						System.out.print("html:" + stu.getHtml());
						System.out.println();

					}
				} else if (meun == 4) {
					System.out.println("종료되었습니다.");
					break;
				} else {
					System.out.println("1~4중에 선택해주세요");
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("에러 발생! 다시 시도 해주세요~ ");
			}
		}
	}

}
