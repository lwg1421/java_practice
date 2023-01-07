package org.opentutorials.javatutorials.variables;

public class StringDemo {

	public static void main(String[] args) {
		String first = "Hello";
		String Second;
		Second = "World";
		System.out.println(first+" "+Second);
		
		// 같은 종류의 변수라면 한번에 여러개 지정도 가능 
		String a,b;
		a = "My";
		b = "name";
		System.out.println(a+b);
		
		// 한줄주석은 슬래시 두개로 작성 가능
		
		/* 여러줄
		 * 주석은
		 * 슬래시와 별로 열어서
		 * 별과 슬래시로 닫아주면 됨
		 */
		
		// 세미콜론은 문장의 끝을 의미한다.
		// 세미콜론을 이용하면 한 줄에 여러개의 문장을 표현할 수 있다.
		String Name = "wonkkkn"; int age = 26;
		System.out.println(Name + age);

	}

}
