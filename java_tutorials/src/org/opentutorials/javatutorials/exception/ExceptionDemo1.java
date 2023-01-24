package org.opentutorials.javatutorials.exception;

// 클래스 A 생성
class A {
	// private 정수형 배열 arr 생성(배열의 크기는 3)
	private int[] arr = new int[3];
	
	// 생성자 생성
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	// z 메서드 생성. 인자값으로 정수 두개를 받음
	public void z(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		// try문을 실행하다가 오류가 발생하면 catch문으로 넘어가 catch 문을 실행한다.
		// catch문이 여러개일 경우 가장 먼저 작성된 catch문부터 예외를 살펴본다.
		// 조건에 맞는 catch 문을 찾았을 경우 그에 해당하는 catch문을 실행하고 catch문에서 빠져나온다.
		// Exception은 모든 예외를 포함하는 가장 포괄적인 예외클래스이므로 가장 나중에 작성해줘야한다.
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch(Exception e) {
			System.out.println("Exception");
		}
		
	}
	
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		A a = new A();
		a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);

	}

}
