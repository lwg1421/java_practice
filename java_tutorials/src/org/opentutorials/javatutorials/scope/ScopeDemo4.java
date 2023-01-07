package org.opentutorials.javatutorials.scope;

class C {
    int v = 10;
 
    void m() {
    	int v = 20;
    	// 여기서의 v는 m이라는 인스턴스 메소드 내부의 지역변수 v를 의미
        System.out.println(v);
        // this는 C클래스의 전역변수 v를 가져올 때 사용
        System.out.println(this.v);
    }
}

public class ScopeDemo4 {
	public static void main(String[] args) {
        C c1 = new C();
        c1.m();
	}

}
