package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	// 해당 클래스에서 전역변수 i 를 설정해줌
	static int i;

	
	// a라는 메소드에서 i값을 0으로 지정함
	static void a() {
		 i = 0;
		 // 위 코드 대신 아래처럼 작성하게되면
		 // int i로서 새로운 지역변수 i를 생성해준 것임
		 // int i는 a메소드 안에서만 존재하는 지역변수이므로
		 // 전혀 외부에 영향을 주지 않음
		 // 따라서 아래처럼 i를 지정해주게 되면 for문에 영향을 주지 않고, 무한루프가 발생하지 않음
//		 int i = 0;
	}


	public static void main(String[] args) {
		for (i = 0; i<5; i++) {
			// a 메소드를 호출하여 for문의 i값에 영향을 미치고 있음을 확인할 수 있다.
			// 계속 i가 0이 되어 무한루프가 발생함
			a();
			System.out.println(i);
		}
	}

}
