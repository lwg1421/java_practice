package sec01_oprator_1.EX02_RelationOperator;

public class RelationOperator {

	public static void main(String[] args) {
		// 크기 비교
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		
		// 등가 비교
		// @기본 자료형 등가 비교
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);
		
		// @참조 자료형 등가 비교
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2);  //false
		// String은 참조 자료형이다.
		// 따라서 스택에는 힙에 위치항 번지값이 저장된다.
		// 따라서 "안녕"이 같아보여도 저장된 번지수가 다르기 때문에 ==의 결과는 false가 된다!

	}

}
