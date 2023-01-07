package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		// 배열과 for문을 간편하게 사용하는 방법
		String[] members = {"최진혁", "최유림", "이원근"};
		for (String i :members) {
			System.out.println(i+"가 상담을 받았습니다.");
		}

	}

}
