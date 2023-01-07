package org.opentutorials.javatutorials.object;

// Calculator 클래스 생성
class Calculator {
	
	// left, right 정수형 변수 생성
	int left;
	int right;

	// setOprands 메소드 생성(매개변수로 정수형 변수 left, right 받음)
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	// sum 메소드 생성
	// left와 right의 합 출력
	public void sum() {
		System.out.println(this.left + this.right);
	}

	// avg 메소드 생성
	// left와 right의 평균 출력
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}



public class CalculatorDemo {

	public static void main(String[] args) {
		// 여기서 c1을 인스턴스라고 함
		// c1이라는 인스턴스를 만든 것임
		Calculator c1 = new Calculator();
		// setOprands에서 4,8을 입력받아 c1인스턴스의 변수로 지정했음
		c1.setOprands(4,8);
		c1.sum();
		c1.avg();
		
		// 여기서 c2를 인스턴스라고 함
		// c2라는 인스턴스를 만든 것임
		Calculator c2 = new Calculator();
		c2.setOprands(80,50);
		c2.sum();
		c2.avg();
		

	}

}
