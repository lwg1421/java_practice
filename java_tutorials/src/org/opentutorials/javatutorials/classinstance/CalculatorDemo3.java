package org.opentutorials.javatutorials.classinstance;
// 클래스 메소드에 대해 알아보자
// 메소드를 지정할 때에 static을 작성해주면 클래스 메소드가 됨
// 클래스 메소드는 사용시에 직접적으로 접근하여 사용이 가능하다
// 인스턴스를 지정하기 위해 new를 사용할 필요가 없어짐

class Calculator3{
	public static void sum(int left,int right) {
		System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
}

public class CalculatorDemo3 {

	/* 사용이 일회성을 가져서 계속해서 인스턴스를 따로 만들어줘야할 필요가 없는 경우
	 * 굳이 new를 사용하여 인스턴스를 새로 만들어주지 않고(코드가 길어지므로)
	 * 그냥 바로 클래스 메소드를 사용하여 인자를 줘 사용하는것이 효율적임
	 */
	
	public static void main(String[] args) {
		Calculator3.sum(10, 100);
		Calculator3.avg(20, 30);

	}

}
