package org.opentutorials.javatutorials.classinstance;
// 클래스 변수와 인스턴스 변수를 함께 사용해보자
// 인스턴스에 따라서 변하지 않는 값이 필요한 경우 클래스 변수를 사용
class Calculator2{
	// 클래스변수 PI 지정
	static double PI = 3.14;
	// 클래스 변수 base 
	// 기본값 0으로 설정
	static int base = 0;
	// 인스턴스 변수 left, right 지정
	int left,right;
	// 메소드 setOprands 생성
	public void setOprands(int left, int right) {
		// 인스턴스 변수 설정
		this.left = left;
		this.right = right;
	}
	// 메소드 sum 생성
	// 더하기에 클래스 변수 base 추가
	public void sum() {
		System.out.println(this.left+this.right+base);
	}
	// 메소드 avg 생성
	// 평균값에 클래스 변수 base 추가
	public void avg() {
		System.out.println((this.left+this.right+base)/2);
	}

}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		// 해당 파일에는 없지만 같은 패키지 안에 Calculator 클래스가 있어서 여기서도 끌어와서 사용 가능
		Calculator c1 = new Calculator();
		c1.setOprands(20, 40);
		System.out.println("====같은 패키지에 있는 Calculator 패키지 사용====");
		c1.sum();
		
		// 여기 파일에서 지정한 Calculator2 클래스 사용
		Calculator2 cc1 = new Calculator2();
		cc1.setOprands(20,50);
		System.out.println("====클래스 변수 base에 기본값 지정 이전====");
		cc1.sum();
		cc1.avg();
		// base 기본값으로 10 설정
		cc1.base = 10;
		System.out.println("====클래스 변수 base에 기본값 10 지정====");
		cc1.sum();
		cc1.avg();

	}

}
