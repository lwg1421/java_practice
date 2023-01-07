package org.opentutorials.javatutorials.scope;
// 유효범위란?

public class ScopeDemo {
	
	// a라는 메소드에서 i값을 0으로 지정함
	static void a() {
		int i = 4;
	}

	public static void main(String[] args) {
		for (int i = 0; i<5; i++) {
			// a 메소드를 호출했음에도 전혀 for문의 i값에 영향을 미치지 않음을 확인할 수 있다.
			a();
			System.out.println(i);
		}

	}

}
