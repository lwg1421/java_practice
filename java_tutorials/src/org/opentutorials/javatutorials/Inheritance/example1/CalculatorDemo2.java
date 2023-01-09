package org.opentutorials.javatutorials.Inheritance.example1;

// 해당 파일 내에는 없지만 같은 패키지 안에 정의되어 있으므로 Calculator의 인용이 가능하다.
class MultiplicationableCalculator extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		MultiplicationableCalculator c1 = new MultiplicationableCalculator();

        c1.sum();
        c1.avg();
        c1.multiplication();

	}

}
