package org.opentutorials.javatutorials.Inheritance.example1;
// 상속이란?


// 부모 클래스
class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
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
    public void substract() {
        System.out.println(this.left - this.right);
}


public class CalculatorDemo1 {

	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		// 부모클래스의 내용을 끌어와 사용 가능
		c1.setOprands(80,5);
		c1.avg();
		c1.sum();
		c1.substract();

		}
	}
}
