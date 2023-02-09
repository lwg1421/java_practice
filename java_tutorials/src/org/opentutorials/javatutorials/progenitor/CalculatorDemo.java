package org.opentutorials.javatutorials.progenitor;

// object 클래스의 toString 메서드란?

// Calculator 클래스 생성
class Calculator{
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
    
    // object 클래스의 toString을 overriding 하여 재정의함.
    public String toString() {
    	return "left : "+this.left+", right : "+this.right;
    }
}

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		
		// 두 코드의 출력은 같음.
		System.out.println(c1.toString());
		System.out.println(c1);

	}

}
