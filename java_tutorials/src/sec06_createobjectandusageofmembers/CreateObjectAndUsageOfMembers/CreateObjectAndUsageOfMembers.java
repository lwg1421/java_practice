package sec06_createobjectandusageofmembers.CreateObjectAndUsageOfMembers;


// 클래스(붕어빵기계) 정의
class A {
	// 필드
	int m = 3;
	// 메서드
	void print() {
		System.out.println("객체 생성 및 활용");
	}
}


public class CreateObjectAndUsageOfMembers {

	public static void main(String[] args) {
		
		// 클래스로 객체(붕어빵) 생성
		A a = new A();
		
		// 클래스 멤버 활용
		// 필드에 값을 쓰고 읽기
		a.m = 5;
		System.out.println(a.m);
		
		// 메서드 활용
		a.print();

	}

}
