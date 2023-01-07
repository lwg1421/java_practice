package org.opentutorials.javatutorials.classinstance;

class C1{
	// 클래스 변수
	static int static_variable = 1;
	// 인스턴스 변수
	int instance_variable = 2;
	// 클래스 메소드
	// 클래스 메소드에서 클래스 변수에 접근 가능
	static void static_static() {
		System.out.println(static_variable);
	}
	
	// 클래스 메소드(static)
	// 클래스 메소드에서는 인스턴스 변수에 접근할 수 없다.
	static void static_instance() {
  	// System.out.println(instance_variable);
	}
	// 인스턴스 메소드 (new로 호출)
	// 인스턴스 메소드에서 클래스 변수에 접근 가능
	void instance_static() {
		System.out.println(static_variable);
	}
	// 인스턴스 메소드 (new로 호출)
	// 인스턴스 메소드는 인스턴스 변수에 접근 가능
	void instance_instance() {
		System.out.println(instance_variable);
	}
}

public class ClassMemberDemo {

	public static void main(String[] args) {
		C1 c = new C1();

		c.static_static();
		C1.static_static();
		
		c.instance_static();
		// 인스턴스 메소드는 바로 호출이 불가능 
		// new로 인스턴스를 만들어 준 후 접근이 가능
//		C1.instance_static();

	}

}
