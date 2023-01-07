package org.opentutorials.javatutorials.classinstance;
// 클래스 변수에 대해 알아보자
// 클래스의 변수이기 때문에 클래스에서 만들어진 모든 인스턴스가 동일한 클래스 변수 값을 가짐
// 인스턴스 변수는 인스턴스마다 변수값이 다름


// Calculator라는 클래스 생성
class Calculator{
	// PI 더블형변수 생성
	// 3.14라는 원주율은 인스턴스마다 변할 필요가 없는 값임
	static double PI = 3.14;

	// left, right 정수형 변수 생성
	int left,right;
	
	// setOprands 메소드 생성(left, right를 인자로 받음)
	// 변수 생성
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	// sum 메소드 생성
	// left,right의 합 출력
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	// avg 메소드 생성
	// left. right의 평균 출력
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}
public class ClaculatorDemo1 {

	public static void main(String[] args) {
		
		
		// PI는 클래스변수이므로 서로 다른 인스턴스에서도 동일한 값이 출력됨
		Calculator c1 = new Calculator();
		c1.setOprands(2,2);
		System.out.println(c1.PI);
		c1.sum();
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		

	}

}
