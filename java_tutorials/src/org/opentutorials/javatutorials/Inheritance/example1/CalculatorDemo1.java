package org.opentutorials.javatutorials.Inheritance.example1;
// 상속이란?


// 부모 클래스
class Calculator{
	int left, right;
	
	public Calculator() {}
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
//	public void setOprands(int left, int right) {
//		this.left = left;
//		this.right = right;
//	}
	
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
    
}

// 자식 클래스
// 부모 클래스에 있는 내용을 상속받음
class SubstractionableCalculator extends Calculator{
	
// 자식 클래스가 부모 클래스를 참조할 수 있는 방법
// 해당 방법은 코드가 길어지는 단점이 있음
//	public SubstractionableCalculator(int left, int right) {
//		this.left = left;
//		this.right = right;	
//	}
	
	public SubstractionableCalculator(int left, int right) {
	// 상위클래스의 생성자에게 left와 right를 인자로 줌
	// 상위클래스에 생성자가 두개가 있지만 그 중에서 left와 right를 인자로 받는 생성자를 자동으로 사용하게 됨
	super(left,right);
	}
	
	public void substract() {
	    System.out.println(this.left - this.right);
	}
}


public class CalculatorDemo1 {

	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator(10,2);
		// 부모클래스의 내용을 끌어와 사용 가능
//		c1.setOprands(80,5);
		c1.avg();
		c1.sum();
		c1.substract();

		}
	
}
