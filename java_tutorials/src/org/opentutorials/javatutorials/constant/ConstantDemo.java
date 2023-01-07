package org.opentutorials.javatutorials.constant;

public class ConstantDemo {

	public static void main(String[] args) {
		// 그냥 float로 지정하고 2.2를 입력하면 에러가 뜸
		// 그러나 float로 지정하고 2.2뒤에 F를 붙여주면 에러가 뜨지 않음
		float a = 2.2F;
		System.out.println(a);
		
		// 그냥 long으로 지정하고 21억5천를 입력하면 에러가 뜸
		// 그러나 long으로 지정하고 21억5천뒤에 L를 붙여주면 에러가 뜨지 않음
		long b = 2150000000L;
		System.out.println(b);
		
		// byte나 short는 따로 뒤에 형변환 지정을 해주지 않아도 자바에서 알아서 이해함
		byte c = 2;
		short d = 10;
		System.out.println("byte : "+c);
		System.out.println("short : "+d);
		
		// 명시적 형변환
		float number = (float)2.2;
		int integer = (int)3.6;
		System.out.println("float : "+number);
		System.out.println("int : "+ integer);
		

	}

}
