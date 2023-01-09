package org.opentutorials.javatutorials.scope;
// 클래스 생성 후 클래스 메소드 생성
// 인스턴스 메소드 생성
// 변수 두개를 받아 합과 곱을 출력하는 메소드 생성
class Calculator_practice{
	// 전역변수 생성
	int one,two;
	
	// 생성자 생성
	// 생성자는 클래스와 이름이 같다
	public Calculator_practice(int one,int two) {
		// 클래스의 전역변수 one을 인자로 받은 one으로 지정
		// 클래스의 전역변수 two을 인자로 받은 two으로 지정
		this.one = one;
		this.two = two;
	}
	
	// 생성자를 사용하지 않을 경우
//	public void set_onetwo(int one, int two) {
//		this.one = one;
//		this.two = two;
//	}
	
	// 클래스 메소드 생성
	public void sum() {
		System.out.println(one+two);
	}
	// 인스턴스 메소드 생성
	public void multi() {
		System.out.println(one*two);
	}
}

public class JustPractice1 {

	public static void main(String[] args) {
		// 생성자를 통해 바로 매개변수 입력이 가능
		Calculator_practice CP1 = new Calculator_practice(4,8);
		CP1.sum();
		CP1.multi();
		
		
//		Calculator_practice CP2 = new Calculator_practice();
//		CP2.set_onetwo(50,10);
//		CP2.sum();
//		CP2.multi();

	}

}
