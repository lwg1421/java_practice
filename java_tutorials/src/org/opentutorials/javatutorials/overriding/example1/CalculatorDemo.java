package org.opentutorials.javatutorials.overriding.example1;
// overriding이란?
// 부모 클래스가 가진 메소드를 자식 클래스에서 필요에 따라 변경할 수 있다.

// super란?
// 부모 키워드를 호출하는 것을 의미

// 부모클래스 생성
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {
        return ((this.left + this.right) / 2);
    }
}


// 자식클래스 생성
// sum 메소드 수정
// avg 메소드 그대로 상속
// substract 메소드 새로 생성
class SubstractionableCalculator extends Calculator {
    public void sum() {
        System.out.println("실행 결과는"+(this.left + this.right)+"입니다.");
    }
    public int avg() {
    	// 부모 클래스의 avg 메소드를 호출
    	return super.avg();	
    }
    public void substract() {
    	System.out.println(this.left-this.right);
    }
    
}

public class CalculatorDemo {

	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(20,10);
		c1.sum();
		c1.avg();
		c1.substract();

	}

}
