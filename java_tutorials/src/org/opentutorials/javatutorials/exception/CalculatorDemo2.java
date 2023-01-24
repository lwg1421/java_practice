package org.opentutorials.javatutorials.exception;

class Calculator2 {
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
			// 에러메시지 출력
			System.out.println("\n\ne.getMessage()\n"+ e.getMessage());
			// 조금 더 자세한 에러메세지 출력
			System.out.println("\n\ne.toString()\n"+e.toString());
			// 더더욱 자세한 에러메세지 출력
            System.out.println("\n\ne.printStackTrace()");
		}
		// try 문이 실행되던 중 오류가 발생하면 try문의 실행을 멈춤
		// 그리고 catch 문을 실행함
		// catch문의 실행이 종료되고 나면 메소드의 실행이 종료되는 것이 아니라
		// 그 뒤에 있는 코드들을 실행함!
		System.out.println("나누기 종료!");
	}
	
}


public class CalculatorDemo2 {

	public static void main(String[] args) {
		// 0으로 나누게 되면 에러 발생
		Calculator2 c2 = new Calculator2();
		c2.setOprands(10, 0);
		c2.divide();

	}

}
