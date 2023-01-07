package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
		int i = 3;
		// i = i+1
		i++;
		System.out.println(i);
		//
		++i;
		System.out.println(i);
		
		// ++i는 괄호 안에서 i+1을 바로 반영
		// 저장하고 출력
		System.out.println(++i);
		
		// i++는 괄호안에서는 값이 반영되지 않지만 괄호 밖에서 i=i+1이 반영됨
		// 출력하고 저장
		System.out.println(i++);
		
		// 그래서 이 이후에 i 를 출력해보면 1이 추가되어 있는 것을 확인이 가능
		System.out.println(i);

	}

}
