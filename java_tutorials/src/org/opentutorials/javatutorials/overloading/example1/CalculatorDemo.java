package org.opentutorials.javatutorials.overloading.example1;
/* overloading이란?
 * 이름은 같지만 시그니처는 다른 메소드를 중복으로 선언 할 수 있는 방법을 
 * 메소드 오버로딩(overloading)이라고 한다.
 * 매개변수가 다르면 이름이 같아도 서로 다른 메소드가 되는 것이다.
 */
class Calculator{
    int left, right;
    int third = 0;
      
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
         
    }
  
}
