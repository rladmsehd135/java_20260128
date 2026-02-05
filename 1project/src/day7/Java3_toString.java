package day7;

public class Java3_toString {
	public static void main(String[] args) {
		
		Person hong = new Person("홍길동",30);
		Person hong2 = new Person("홍길동",30);
		
		String a = new String("test");
		String b = new String("test");
		System.out.println(hong == hong2);
		System.out.println(hong.toString());
		System.out.println(a.equals(b));
		
		String str = new String("zz");
		System.out.println(str);
	}
}
