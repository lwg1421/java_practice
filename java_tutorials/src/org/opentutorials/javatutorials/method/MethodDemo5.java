package org.opentutorials.javatutorials.method;

public class MethodDemo5 {
	
	// 첫번째 입력값부터 두번쨰 입력값까지 출력하는 코드 작성
	// void의 의미는 반환값이 아무것도 없다는 것을 의미
	public static void printcode(int one, int two) {
		System.out.println(one+"부터"+two+"까지 출력합니다.");

		int i = one;
		while (i<=two) {
			System.out.println(i+"를 출력합니다.");
			i++;
		}
	}

	public static void main(String[] args) {
		printcode(3,10);
		

	}

}
