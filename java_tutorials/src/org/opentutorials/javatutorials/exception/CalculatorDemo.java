package org.opentutorials.javatutorials.exception;

class Calculator {
	// left, right 정수형 변수 생성
	int left,right;
	
	// setOprands 메서드 생성
	// 인자값으로 정수 두개를 받음
	// void : return되는 타입이 없음을 의미
	// public : 접근 제어자. 모든 곳에서 접근이 가능
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	// divide 메서드 생성
	// 인자값 없음. left를 right값으로 나눈 결과를 출력
	// try를 실행하던 중 오류가 발생하면 실행을 중단하고 catch로 넘어가 catch문을 실행하게 된다.
	public void divide() {
		try {
			System.out.println("나누기 계산 결과는");
			System.out.println(this.left/this.right);
			System.out.println("입니다.");	
		} catch(Exception e) {
			System.out.println("오류가 발생했습니다 : "+ e.getMessage());
		}
		
	}
	
}

public class CalculatorDemo {

	public static void main(String[] args) {
		
		// 0으로 나누게 되면 에러 발생
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();

	}

}
